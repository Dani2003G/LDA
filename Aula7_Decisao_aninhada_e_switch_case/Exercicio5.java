/* 
Faça um programa em Java que obtenha o preço atual de um produto e a sua venda
média mensal, calcule e mostre o novo preço (pode ser aumentado ou diminuído). Para
isso, utilize a tabela abaixo:
*/
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double preco;
        int media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço atual do produto: ");
        preco = sc.nextDouble();
        System.out.print("Digite a venda mensal do produto: ");
        media = sc.nextInt();

        if(media < 500 && preco < 30) {
            preco = preco + preco * 0.1;
            System.out.printf("O produto terá um aumento de 10%% então o seu novo valor é de %.2f", preco);
        }
        else if(media >= 500 && media < 1200 && preco >= 30 && preco < 80) {
            preco = preco + preco * 0.15;
            System.out.printf("O produto terá um aumento de 15%% então o seu novo valor é de %.2f", preco);
        } 
        else if(media >= 1200 && preco >= 80) {
            preco = preco - preco *0.2;
            System.out.printf("O produto terá uma diminuição de 20%% então o seu novo valor é de %.2f", preco);
        }

        sc.close();
    }
}
