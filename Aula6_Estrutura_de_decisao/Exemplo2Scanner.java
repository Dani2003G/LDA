/*
Crie um algoritmo e um programa em Java que solicite ao usuário a sua idade e
mostre se o mesmo pode ou não ter CHN
*/
import java.util.Scanner;

public class Exemplo2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("Você pode ter CNH");
        } else {
            System.out.println("Você não pode ter CNH");
        }

        sc.close();
    }
}
