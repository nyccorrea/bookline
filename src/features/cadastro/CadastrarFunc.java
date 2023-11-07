package features.cadastro;

import java.util.ArrayList;
import java.util.Scanner;

import users.Funcionario;

//classe de cadastro de funcionário
public class CadastrarFunc {
    public ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    /*
     * método sem retorno
     * que cadastra funcionário a partir de um objeto do tipo "Funcionario"
     * e seus parâmetros subsequentes (nome, matricula, cpf, email, senha).
     */
    public void realizarCadastroFunc(Funcionario funcionario, String nome, String matricula, String cpf, String email,
            String senha) {

        funcionario.setNome_func(nome);
        funcionario.setMatricula_func(matricula);
        funcionario.setCpf_func(cpf);
        funcionario.setEmail_func(email);
        funcionario.setSenha_func(senha);

        System.out.println("Cadastro como funcionário realizado com sucesso.");
        listaFuncionarios.add(funcionario);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CadastrarFunc func = new CadastrarFunc();
        Funcionario funcionario = new Funcionario();

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

        scanner.close();
    }
}