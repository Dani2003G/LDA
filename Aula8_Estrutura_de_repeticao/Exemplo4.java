import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        int num, fatorial, i;

        Scanner sc = new Scanner(System.in);

        fatorial = 1;

        System.out.print("Digite um número inteiro positivo: ");
        num = sc.nextInt();

        for(i = 1; i <= num; i++) {
            fatorial *= i; 
        }

        if(num > 0) {
            System.out.printf("O fatorial do número é %d", fatorial);
        } else {
            System.out.println("Não há fatorial de número negativo");
        }

        sc.close();
    }
}
