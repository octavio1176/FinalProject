package domain.fornecedor;

import java.util.List;

public interface FornecedorRepository{
    void criar(String nome, int nuit);
   Fornecedor findByName(String name);
   List<Fornecedor> listAll();
}
