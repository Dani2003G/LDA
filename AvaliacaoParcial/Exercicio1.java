/*
Faça um programa em Java que solicite ao usuário 10 números inteiros, calcule e mostre a quantidade
de números digitados que são pares e maiores do que 10. É obrigatório o uso de estrutura condicional e estrutura de
repetição, não é permitida a utilização de vetor.
Obs.: Utilizar a entrada e saída de dados pelo terminal (Scanner e System.out).  
*/
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int i, num, qtde = 0;

        Scanner sc = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if(num > 10 && num % 2 == 0)
                qtde++;
        }

        System.out.printf("A quantidade números maiores de 10 e pares é %d", qtde);
        sc.close();
    }
}
// RGM: 25496581