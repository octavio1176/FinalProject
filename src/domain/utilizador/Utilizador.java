package domain.utilizador;

public final class Utilizador {
    private String username;
    private String senha;

    public Utilizador(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

}
