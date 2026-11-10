package domain.produto;

import java.util.Vector;

public interface ProdutoRepository {
    void criarProduto(String nome, int id, int quantidade);
    Produto procurarPorId(int id);
    Produto procurarPorNome(String nome);
    Vector<Produto> listarProdutosComStockMenorQue5();
    void deletarProduto(String nome);
    void deletarProduto(int codigo);
    void deletarTodosProdutos();
    Vector<Produto> listarProdutos();


}
