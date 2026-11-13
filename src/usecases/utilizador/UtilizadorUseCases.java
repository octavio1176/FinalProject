package usecases.utilizador;


import domain.utilizador.Utilizador;
import domain.utilizador.UtilizadorNaoEncontradoException;
import domain.utilizador.UtilizadorRepository;

public class UtilizadorUseCases  {

    private final UtilizadorRepository utilizadorRepository;

    public UtilizadorUseCases(UtilizadorRepository utilizadorRepository) {
        this.utilizadorRepository = utilizadorRepository;
    }


    public void SignUp(String username , String email , String senha){
        utilizadorRepository.saveUser(username, email, senha);
    }

    public boolean signIn(String username ,  String senha){
        Utilizador utilizador = utilizadorRepository.findUserByName(username);
        if (utilizador==null){
            throw new UtilizadorNaoEncontradoException();
        }
        return utilizador.getSenha().equals(senha);
    }


}
