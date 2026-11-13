package domain.fornecedor;

public class Fornecedor {
    private int codigo;
    private String nome;
    private String nuit;
    private int codigoFornecedor;

    public Fornecedor(int codigo, String nome, String nuit, int codigoFornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.nuit = nuit;
        this.codigoFornecedor=codigoFornecedor;
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

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }
}

