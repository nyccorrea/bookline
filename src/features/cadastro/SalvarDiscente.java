package features.cadastro;

import java.io.IOException;
import java.io.PrintWriter;

import users.Discente;

public class SalvarDiscente {
    // Método para salvar dados de Discente
    public static void salvarDadosDiscente(Discente discente) {
        // try-with-resources abre o arquivo e garante seu fechamento automático.
        try (PrintWriter writer = new PrintWriter("discente.txt")) {
            // Escreve os dados do discente no arquivo linha por linha.
            writer.println(discente.getNome_disc()); // Escreve o nome na primeira linha
            writer.println(discente.getMatricula_disc()); // Escreve a matrícula na segunda linha
            writer.println(discente.getCpf_disc()); // Escreve o CPF na terceira linha
            writer.println(discente.getEmail_disc()); // Escreve o email na quarta linha
            writer.println(discente.getSenha_disc()); // Escreve a senha na quinta linha
        } catch (IOException e) {
            // Em caso de erro de E/S (IOException), registramos o erro.
            e.printStackTrace();
        }
    }
}
