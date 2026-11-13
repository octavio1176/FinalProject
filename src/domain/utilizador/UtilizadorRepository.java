package domain.utilizador;

public interface UtilizadorRepository {
    Utilizador findUserByName( String senha);
    void saveUser(String username, String email , String senha);

}
