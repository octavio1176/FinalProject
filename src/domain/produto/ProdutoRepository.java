package domain.produto;

import java.util.List;

public interface ProdutoRepository {
    void criarProduto(String nome, int id, int quantidade);
    Produto procurarPorId(int id);
    Produto procurarPorNome(String nome);
    List<Produto> listarProdutos();
}
