/*
Faça um programa que solicite ao usuário um número inteiro, calcule e mostre a raiz
quadrada desse número. O programa deverá verificar antes se o número digitado é
positivo, exibindo uma mensagem de alerta, caso seja negativo.
*/
import java.util.Scanner;

public class Exemplo5Scanner {
    public static void main(String[] args) {
        int num;
        double raiz;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if(num >= 0) {
            raiz = Math.sqrt(num);
            System.out.printf("A raiz de %d é %.2f", num, raiz);
        } else {
            System.out.println("Não é possivel calcular a raiz de um número negativo");
        }

        sc.close();
    }
}
