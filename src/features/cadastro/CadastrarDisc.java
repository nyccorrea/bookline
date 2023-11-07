package features.cadastro;

import java.util.ArrayList;
import java.util.Scanner;

import users.Discente;

//classe de cadastro de discente
public class CadastrarDisc {
    public ArrayList<Discente> listaDiscentes = new ArrayList<>();
    /*
     * método sem retorno
     * que cadastra discente a partir de um objeto do tipo "Discente"
     * e seus parâmetros subsequentes (nome, matricula, cpf, email, senha).
     */
    public void realizarCadastroDisc(Discente discente, String nome, String matricula, String cpf, String email,
            String senha) {


        discente.setNome_disc(nome);
        discente.setMatricula_disc(matricula);
        discente.setCpf_disc(cpf);
        discente.setEmail_disc(email);
        discente.setSenha_disc(senha);

        System.out.println("Cadastro como discente realizado com sucesso.");

        listaDiscentes.add(discente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //construtores 
        Discente instanciaDiscente = new Discente();
        CadastrarDisc instanciaCadastrarDisc = new CadastrarDisc();

        //recebe os inputs para o cadastro
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

        //realiza o cadastro do discente conforme os dados informados
        instanciaCadastrarDisc.realizarCadastroDisc(instanciaDiscente, nome, matricula, cpf, email, senha);

        scanner.close();
    }
}