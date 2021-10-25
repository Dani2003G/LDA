/*
Faça um algoritmo que leia um valor n, inteiro e positivo, calcule e mostre a seguinte
soma:
S = 1 + 1/2 + 1/3 + 1/4 +...+ 1/n
*/
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int n, i, soma;

        Scanner sc = new Scanner(System.in);

        soma = 1;

        System.out.print("Digite um número inteiro positivo: ");
        n = sc.nextInt();
        sc.close();

        for(i = 2; i <= n; i++) {
            soma += 1/i;
        }

        if(n >= 1) {
            System.out.print("A soma deu " + soma);
        } else {
            System.out.println("Número difitado inválido");
        }
    }
}
