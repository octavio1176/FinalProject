package usecases.produto.filtros;

import domain.produto.ProdutoRepository;


public class fildtroDeProdutos {
    private final ProdutoRepository produtoRepository;

    public fildtroDeProdutos(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

}
