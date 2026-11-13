package infrastruture.database;

import domain.utilizador.Utilizador;
import domain.utilizador.UtilizadorRepository;

import java.io.IOException;

import java.util.Vector;

import java.io.*;

public class UtilizadorDb implements UtilizadorRepository {

    private static final String FILE_PATH = "utilizadores.txt";

    @Override
    public void saveUser(String username, String email, String senha) {
        Vector<Utilizador> utilizadores = carregarParaVector();
        utilizadores.add(new Utilizador(username, email, senha));
        reescreverFicheiro(utilizadores);
    }

    @Override
    public Utilizador findUserByName(String usernameBuscado) {
        Vector<Utilizador> utilizadores = carregarParaVector();

        for (int i = 0; i < utilizadores.size(); i++) {
            Utilizador user = utilizadores.get(i);
            if (user.getUsername().equals(usernameBuscado)) {
                return user;
            }
        }
        return null;
    }

    private Vector<Utilizador> carregarParaVector() {
        Vector<Utilizador> vector = new Vector<>();
        File arquivo = new File(FILE_PATH);

        if (!arquivo.exists()) {
            return vector;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length >= 3) {
                    vector.add(new Utilizador(dados[0], dados[1], dados[2]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o ficheiro: " + e.getMessage());
        }

        return vector;
    }

    private void reescreverFicheiro(Vector<Utilizador> utilizadores) {
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FILE_PATH)))) {
            for (int i = 0; i < utilizadores.size(); i++) {
                Utilizador u = utilizadores.get(i);
                writer.println(u.getUsername() + ";" + u.getEmail() + ";" + u.getSenha());
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no ficheiro: " + e.getMessage());
        }
    }
}