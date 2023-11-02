package features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {

    // variaveis que armazenam valores informados para a entrada no sistema
    public String email_informado;
    public String senha_informada;

    // Método para carregar email e senha salvos no arquivo "discente.txt"
    private String[] carregarDadosSalvosDiscente() {
        String[] emailESenhaDiscente = new String[2];

        try (BufferedReader reader = new BufferedReader(new FileReader("discente.txt"))) {
            // Lê e descarta as três primeiras linhas (não usadas)
            for (int i = 0; i < 3; i++) {
                reader.readLine();
            }
            emailESenhaDiscente[0] = reader.readLine(); // Lê a 4ª linha do arquivo (email)
            emailESenhaDiscente[1] = reader.readLine(); // Lê a 5ª linha do arquivo (senha)
        } catch (IOException e) {
            e.printStackTrace();
        }

        return emailESenhaDiscente;
    }

    // Método para carregar email e senha salvos no arquivo "funcionario.txt"
    private String[] carregarDadosSalvosFuncionario() {
        String[] emailESenhaFuncionario = new String[2];

        try (BufferedReader reader = new BufferedReader(new FileReader("funcionario.txt"))) {
            // Lê e descarta as três primeiras linhas (não usadas)
            for (int i = 0; i < 3; i++) {
                reader.readLine();
            }
            emailESenhaFuncionario[0] = reader.readLine(); // Lê a 4ª linha do arquivo (email)
            emailESenhaFuncionario[1] = reader.readLine(); // Lê a 5ª linha do arquivo (senha)
        } catch (IOException e) {
            e.printStackTrace();
        }

        return emailESenhaFuncionario;
    }

    // método sem retorno para realizar login.
    public void realizarLogin(String email_disc, String senha_disc, String email_func, String senha_func) {

        String[] emailSenhaDiscente = carregarDadosSalvosDiscente();
        String[] emailSenhaFuncionario = carregarDadosSalvosFuncionario();

        if (email_informado.equals(emailSenhaFuncionario[0]) && senha_informada.equals(emailSenhaFuncionario[1])) {
            System.out.println("Login efetuado com sucesso como Funcionário!");
        }else if (email_informado.equals(emailSenhaDiscente[0]) && senha_informada.equals(emailSenhaDiscente[1])) {
            System.out.println("Login efetuado com sucesso como Discente!");
        } else {
            System.out.println("Email ou senha incorretas, tente novamente!");
        }
    }
}
