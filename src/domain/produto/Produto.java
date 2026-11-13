package domain.produto;

import java.time.LocalDate;
;

public class Produto {
    private String nome;
    private int codigo;
    private int armazemNumero;
    private  int stockMinimo;
    private int quantidade;
    private double preco;
    private LocalDate localDate;

    public Produto(String nome, int codigo, int armazemNumero,  int quantidade, double preco, LocalDate localDate) {
        this.nome = nome;
        this.codigo = codigo;
        this.armazemNumero = armazemNumero;
        this.stockMinimo = 5;
        this.quantidade = quantidade;
        this.preco = preco;
        this.localDate = localDate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getArmazemNumero() {
        return armazemNumero;
    }

    public void setArmazemNumero(int armazemNumero) {
        this.armazemNumero = armazemNumero;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

}