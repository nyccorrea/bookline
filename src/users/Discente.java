package users;

public class Discente {
    //atributos
    private String nome_disc,
            matricula_disc,
            cpf_disc,
            email_disc,
            senha_disc;

    //métodos get e set
    public String getNome_disc() {
        return nome_disc;
    }

    public void setNome_disc(String nome_disc) {
        this.nome_disc = nome_disc;
    }

    public String getMatricula_disc() {
        return matricula_disc;
    }

    public void setMatricula_disc(String matricula_disc) {
        this.matricula_disc = matricula_disc;
    }

    public String getCpf_disc() {
        return cpf_disc;
    }

    public void setCpf_disc(String cpf_disc) {
        this.cpf_disc = cpf_disc;
    }

    public String getEmail_disc() {
        return email_disc;
    }

    public void setEmail_disc(String email_disc) {
        this.email_disc = email_disc;
    }

    public String getSenha_disc() {
        return senha_disc;
    }

    public void setSenha_disc(String senha_disc) {
        this.senha_disc = senha_disc;
    }

    //classe de cadastro de discente
    public class CadastrarDisc {
        /*método sem retorno 
        que cadastra discente a partir de um objeto do tipo "Discente" 
        e seus parâmetros subsequentes (nome, matricula, cpf, email, senha).*/
        public void realizarCadastroDisc(Discente discente, String nome, String matricula, String cpf, String email, String senha) {
            
            discente.setNome_disc(nome);
            discente.setMatricula_disc(matricula);
            discente.setCpf_disc(cpf);
            discente.setEmail_disc(email);
            discente.setSenha_disc(senha);

            System.out.println("Cadastro realizado com sucesso.");
        }
    }
}
