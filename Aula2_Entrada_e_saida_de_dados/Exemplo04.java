import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome);
        sc.close();
    }
}