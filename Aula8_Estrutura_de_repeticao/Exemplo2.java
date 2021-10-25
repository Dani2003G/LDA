import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        int num, i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber a sua taboada: ");
        num = sc.nextInt();

        for(i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }

        sc.close();
    }
}