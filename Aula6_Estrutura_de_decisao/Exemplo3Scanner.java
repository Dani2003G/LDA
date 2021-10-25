/*
Crie um algoritmo e um programa em Java que solicite ao usuário um número e
mostre se o mesmo é par ou ímpar.
*/
import java.util.Scanner;

public class Exemplo3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.printf("%d é par", num);
        } else {
            System.out.printf("%d é impar", num);
        }

        sc.close();
    }
}