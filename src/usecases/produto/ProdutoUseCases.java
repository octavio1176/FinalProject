package usecases.produto;

import domain.produto.Produto;
import domain.produto.ProdutoRepository;

import java.util.List;

public class ProdutoUseCases {
   private final ProdutoRepository produtoRepository;

    public ProdutoUseCases(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void criar(String nome, int id, int quantidade){
        produtoRepository.criarProduto(nome, id,quantidade);
    }

    public Produto procurarPorId(int id){
        return produtoRepository.procurarPorId(id);
    }

    public Produto procurarPorNome(String nome){
        return produtoRepository.procurarPorNome(nome);
    }

    public void eliminarPorNome(String nome){
        produtoRepository.deletarProduto(nome);
    }

    public void eliminarPorId(int id){
        produtoRepository.deletarProduto(id);
    }

    public List<Produto> listar(){
        return produtoRepository.listarProdutos();
    }



}
