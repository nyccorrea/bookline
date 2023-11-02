package users;

public class Funcionario {
    //atributos
    private String nome_func,
            matricula_func,
            cpf_func,
            email_func,
            senha_func;

    //métodos get e set
    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getMatricula_func() {
        return matricula_func;
    }

    public void setMatricula_func(String matricula_func) {
        this.matricula_func = matricula_func;
    }

    public String getCpf_func() {
        return cpf_func;
    }

    public void setCpf_func(String cpf_func) {
        this.cpf_func = cpf_func;
    }

    public String getEmail_func() {
        return email_func;
    }

    public void setEmail_func(String email_func) {
        this.email_func = email_func;
    }

    public String getSenha_func() {
        return senha_func;
    }

    public void setSenha_func(String senha_func) {
        this.senha_func = senha_func;
    }
}