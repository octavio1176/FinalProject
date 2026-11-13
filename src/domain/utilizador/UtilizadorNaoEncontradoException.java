package domain.utilizador;

public class UtilizadorNaoEncontradoException extends RuntimeException {
    public UtilizadorNaoEncontradoException(){
        super("utilizador nao encontrado");
    }
}
