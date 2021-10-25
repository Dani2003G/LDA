/* 
Criar um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral:
• não-eleitor (abaixo de 16 anos)
• eleitor obrigatório (entre 18 e 65 anos)
• eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
*/
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int idade;
        String resposta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade para sabermos a sua classe eleitoral: ");
        idade = sc.nextInt();

        resposta = idade < 16 ? "Você não é um eleitor" : idade >= 18 && idade <= 65 ? "Você é um eleitor com voto obrigatório" : "Você é um eleitor com voto facultativo";
        
        System.out.println(resposta);

        sc.close();
    }
}
