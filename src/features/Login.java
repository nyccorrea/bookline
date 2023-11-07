package features;

import java.util.Scanner;

import features.cadastro.CadastrarDisc;
import features.cadastro.CadastrarFunc;
import users.Discente;
import users.Funcionario;

public class Login {

    // valida acesso do funcionario no sistema através do arrayList
    public boolean validarAcessoFunc(String emailUsuario, String senha) {
        //instância para poder usar o ArrayList de discentes cadastrados
        CadastrarFunc instanciaArrayFunc = new CadastrarFunc();
    
        for (Funcionario funcionario : instanciaArrayFunc.listaFuncionarios) {
            if (funcionario.getEmail_func().equals(emailUsuario) && funcionario.getSenha_func().equals(senha)) {
                return true; // Acesso válido
            }
        }
        return false; // Acesso inválido
    }

    // valida acesso do discente no sistema através do arrayList
    public boolean validarAcessoDisc(String emailUsuario, String senha) {
        //instância para poder usar o ArrayList de discentes cadastrados
        CadastrarDisc instanciaArrayDisc = new CadastrarDisc();
        for (Discente discente : instanciaArrayDisc.listaDiscentes) {
            if (discente.getEmail_disc().equals(emailUsuario) && discente.getSenha_disc().equals(senha)) {
                return true; // Acesso válido
            }
        }
        return false; // Acesso inválido
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login(); // Instância da classe Login

        System.out.println("--------- LOGIN ---------");
        System.out.print("Email: ");
        String email_informado = scanner.nextLine();
        System.out.print("Senha: ");
        String senha_informada = scanner.nextLine();

        login.validarAcessoDisc(email_informado, senha_informada); // validar o acesso para discente
        login.validarAcessoFunc(email_informado, senha_informada); // valida acesso para funcionário

        scanner.close();
    }
}
