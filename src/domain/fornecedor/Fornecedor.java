package domain.fornecedor;

public class Fornecedor {
    private int codigo;
    private String nome;
    private String nuit;

    public Fornecedor(int codigo, String nome, String nuit) {
        this.codigo = codigo;
        this.nome = nome;
        this.nuit = nuit;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }
}

