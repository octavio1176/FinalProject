import domain.utilizador.Utilizador;
import usecases.utilizador.UtilizadorUseCases;

void main() {
    Utilizador utilizador = new Utilizador("op", "1234", "emoa");
    UtilizadorUseCases utilizadorUseCases = new UtilizadorUseCases();
    utilizadorUseCases.SignUp(utilizador.getUsername(), utilizador.getSenha(), utilizador.getEmail());
    boolean resultado = utilizadorUseCases.signIn("op", "1234");
    System.out.println(resultado);

}