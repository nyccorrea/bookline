package features;

import java.util.Scanner;

import features.cadastro.CadastrarDisc;
import features.cadastro.CadastrarFunc;


public class IniciarSistema {
    public static void main(String[] args) {

        //inicia o sistema
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------ BEM-VINDO AO BOOKLINE ------------------");
        System.out.println("--> O que deseja? [1 - Efetuar Login] [2 - Efetuar Cadastro]");
        int resposta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if(resposta == 1){
            Login.main(args);
            Catalogo.main(args);
        }else if(resposta == 2){
            //bloco que pega os inputs para usar no cadastro do sistema
            System.out.println("---------------------- Cadastrar-se ----------------------");
            System.out.println("Você é funcionário ou discente? [ f para Funcionario | d para Discente ]");
            char opcao = scanner.next().toLowerCase().charAt(0);

            if(opcao == 'f'){
                CadastrarFunc.main(args);
                
            }else if(opcao == 'd'){
                CadastrarDisc.main(args);
            }else{
                System.out.println("Valor inválido!");
            }
            
        }else{
            System.out.println("Insira um valor válido!");
        }
        scanner.close();
    }
}
