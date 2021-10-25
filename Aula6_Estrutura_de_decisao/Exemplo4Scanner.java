/*
Crie um programa em Java que solicite duas notas de um aluno ao usuário, calcule a
média e mostre se o mesmo está aprovado (média >=6.0) ou reprovado caso contrário.
*/
import java.util.Scanner;

public class Exemplo4Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Digite a sua primeira nota: ");
        nota1 = sc.nextInt();
        System.out.print("Digite a sua segunda nota: ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2;

        if(media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}