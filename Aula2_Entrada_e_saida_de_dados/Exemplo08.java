import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o primeiro número: "); 
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: "); 
        n2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: "); 
        n3 = sc.nextDouble();
        System.out.print("Digite o quarto número: "); 
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("A média dos números digitados é de: %.2f", media);
        sc.close();
    }
}
