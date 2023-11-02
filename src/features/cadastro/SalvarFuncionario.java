package features.cadastro;

import java.io.IOException;
import java.io.PrintWriter;
import users.Funcionario;

public class SalvarFuncionario {
    // Método para salvar dados de Funcionario
    public static void salvarDadosFuncionario(Funcionario funcionario) {
        // try-with-resources abre o arquivo e garante seu fechamento automático.
        try (PrintWriter writer = new PrintWriter("funcionario.txt")) {
            // Escreve os dados do funcionario no arquivo linha por linha.
            writer.println(funcionario.getNome_func()); // Escreve o nome na primeira linha
            writer.println(funcionario.getMatricula_func()); // Escreve a matrícula na segunda linha
            writer.println(funcionario.getCpf_func()); // Escreve o CPF na terceira linha
            writer.println(funcionario.getEmail_func()); // Escreve o email na quarta linha
            writer.println(funcionario.getSenha_func()); // Escreve a senha na quinta linha
        } catch (IOException e) {
            // Em caso de erro de E/S (IOException), registramos o erro.
            e.printStackTrace();
        }
    }    
}
