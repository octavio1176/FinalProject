package domain.venda;

import domain.produto.Produto;

public class Venda {
    private  final Produto produto;

    public Venda(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

}
