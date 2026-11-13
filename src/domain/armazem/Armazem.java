package domain.armazem;


import java.io.Serializable;

public class Armazem implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numero;
    private String nome;
    private String localizacao;
    private int totalProdutos;

    public Armazem(int numero, String nome, String localizacao) {
        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;
        this.totalProdutos = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getTotalProdutos() {
        return totalProdutos;
    }

    public void adicionarProduto() {
        totalProdutos++;
    }

    public void removerProduto() {
        if (totalProdutos > 0) {
            totalProdutos--;
        }
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
}
