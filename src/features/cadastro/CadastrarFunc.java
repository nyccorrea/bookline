package features.cadastro;

import users.Funcionario;

//classe de cadastro de funcionário
public class CadastrarFunc {
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

        System.out.println("Cadastro realizado com sucesso.");
    }
}