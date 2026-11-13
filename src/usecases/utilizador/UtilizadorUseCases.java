package usecases.utilizador;


import domain.utilizador.Utilizador;

import java.util.ArrayList;
import java.util.List;

public class UtilizadorUseCases  {
    private List<Utilizador> utilizadors = new ArrayList<>();

    public void SignUp(String username , String email , String senha){
        utilizadors.add(new Utilizador(username, senha, email));
    }

    public boolean signIn(String username ,  String senha){
        for (Utilizador utilizador : utilizadors) {
            if (utilizador.getUsername().equals(username) && utilizador.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }



}
