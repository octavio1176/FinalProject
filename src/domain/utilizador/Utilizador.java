package domain.utilizador;

import java.io.Serializable;

public final class Utilizador  implements Serializable {
    private String username;
    private String senha;
    private String email;

    public Utilizador(String username, String senha, String email) {

        this.username = username;
        this.senha = senha;
        this.email=email;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail(){
        return email;
    }

}
