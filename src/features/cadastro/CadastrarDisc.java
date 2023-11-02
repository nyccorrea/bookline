package features.cadastro;

import users.Discente;

//classe de cadastro de discente
public class CadastrarDisc {
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

        System.out.println("Cadastro realizado com sucesso.");
    }
}