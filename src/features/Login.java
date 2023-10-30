package features;

import users.Discente;
import users.Funcionario;
import java.util.Scanner;

public class Login {
    //método sem retorno para realizar login.
    public void realizarLogin(Discente email_disc, Discente senha_disc, Funcionario email_func, Funcionario senha_func){

        Scanner scanner = new Scanner(System.in);

        //bloco que pega os inputs para usar na validação
        System.out.println("--------- LOGIN ---------");
        System.out.print("Email: ");
        String email_informado = scanner.nextLine();
        System.out.print("Senha: ");
        String senha_informada = scanner.nextLine();

        if(email_informado.equals(email_func.getEmail_func()) && senha_informada.equals(senha_func.getSenha_func())){
            System.out.println("Login efetuado com sucesso!");
        }
        else if(email_informado.equals(email_disc.getEmail_disc()) && senha_informada.equals(senha_disc.getSenha_disc())){
            System.out.println("Login efetuado com sucesso!");
        }
        else {
            System.out.println("Email ou senha incorretas, tente novamente!");
        }
        scanner.close();
    }
}
