/*
Crie um algoritmo e um programa em Java que solicite ao usuário três valores inteiros
(A, B e C) e verifica se o valor armazenado em B é o menor
*/
import java.util.Scanner;

public class Exemplo6Scanner {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        if(a > b && b < c) {
            System.out.println("O valor armazenado em b é menor");
        } else {
            System.out.println("O valor aarmazenado em b não é menor");
        }

        sc.close();
    }
}
