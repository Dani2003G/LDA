/*
Faça um algoritmo que leia um vetor de 10 posições de números inteiros e divida
todos os seus elementos pelo maior valor do vetor e armazene o resultado no mesmo
vetor. Mostre o vetor após os cálculos
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int vetor1[] = new int[10];
        double vetor2[] = new double[10];
        int maior, i;

        Scanner sc = new Scanner(System.in);

        for(i = 0; i < vetor1.length; i++){
            System.out.print("Digite um número: ");
            vetor1[i] = sc.nextInt();
        }

        maior = vetor1[0];

        for(i = 0; i < vetor1.length; i++) {
            if(vetor1[i] > maior)
                maior = vetor1[i];
        }

        for(i = 0; i < vetor1.length; i++){
            vetor2[i] = (double)vetor1[i] / maior;
            System.out.printf("%.2f", vetor2[i]);
            System.out.println();
        }

        sc.close();
    }
}