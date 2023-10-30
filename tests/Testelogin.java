package tests;

import users.Funcionario;
import users.Funcionario.CadastrarFunc;
import features.Login;
import users.Discente;
import users.Discente.CadastrarDisc;

public class Testelogin {
    public static void main(String[] args) {

        //construtores Funcionario e Discente
        Funcionario funcionario = new Funcionario();
        Discente discente = new Discente();

        //teste cadastrar discente
        CadastrarDisc cadastrarDisc = discente.new CadastrarDisc();
        cadastrarDisc.realizarCadastroDisc(discente, "Paula", "11111", "123-45-0009", "paula@example.com", "senha1234");

        //teste cadastra funcionario
        CadastrarFunc cadastrarFunc = funcionario.new CadastrarFunc();
        cadastrarFunc.realizarCadastroFunc(funcionario, "Ana Maria", "12345", "123-45-6789", "anamaria@example.com", "senha123");

        // teste login funcionário
        Login login = new Login();
        login.realizarLogin(discente, discente, funcionario, funcionario);
    }
}
