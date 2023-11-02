package features;

import users.Funcionario;
import users.Discente;

import java.util.Scanner;

import features.cadastro.CadastrarDisc;
import features.cadastro.CadastrarFunc;
import features.cadastro.SalvarDiscente;
import features.cadastro.SalvarFuncionario;

public class IniciarSistema {
    public static void main(String[] args) {
        //construtores das classes 
        Login login = new Login();
        Funcionario funcionario = new Funcionario();
        CadastrarFunc func = new CadastrarFunc();
        Discente discente = new Discente();
        CadastrarDisc disc = new CadastrarDisc();
        //inicia o sistema
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------ BEM-VINDO AO BOOKLINE ------------------");
        System.out.println("--> O que deseja? [1 - Efetuar Login] [2 - Efetuar Cadastro]");
        int resposta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if(resposta == 1){
            //bloco que pega os inputs para usar na entrada do sistema
            System.out.println("--------- LOGIN ---------");
            System.out.print("Email: ");
            login.email_informado = scanner.nextLine();
            System.out.print("Senha: ");
            login.senha_informada = scanner.nextLine();

            //valida email e senha
            login.realizarLogin(discente.getEmail_disc(), discente.getSenha_disc(), funcionario.getEmail_func(), funcionario.getSenha_func());
           // mostra livros
            Catalogo.main(args);
        }else if(resposta == 2){
            //bloco que pega os inputs para usar no cadastro do sistema
            System.out.println("---------------------- Cadastrar-se ----------------------");
            System.out.println("Você é funcionário ou discente? [ f para Funcionario | d para Discente ]");
            char opcao = scanner.next().toLowerCase().charAt(0);

            if(opcao == 'f'){
                System.out.println("Por favor funcionário, informe os dados abaixo.");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Matrícula: ");
                String matricula = scanner.next();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("Email: ");
                String email = scanner.next();
                System.out.print("Crie uma senha: ");
                String senha = scanner.next();

                //realiza o cadastro do funcionario
                func.realizarCadastroFunc(funcionario, nome, matricula, cpf, email, senha);
                //armazena os dados do funcionário para o arquivo "funcionario.txt"
                SalvarFuncionario.salvarDadosFuncionario(funcionario);
                
            }else if(opcao == 'd'){
                System.out.println("Por favor discente, informe os dados abaixo.");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Matrícula: ");
                String matricula = scanner.next();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("Email: ");
                String email = scanner.next();
                System.out.print("Crie uma senha: ");
                String senha = scanner.next();

                //realiza o cadastro do discente
                disc.realizarCadastroDisc(discente, nome, matricula, cpf, email, senha);
                //armazena os dados do discente para o arquivo "discente.txt"
                SalvarDiscente.salvarDadosDiscente(discente);
                Catalogo.main(args);
            }else{
                System.out.println("Valor inválido!");
            }
            
        }else{
            System.out.println("Insira um valor válido!");
        }
        scanner.close();
    }
}
