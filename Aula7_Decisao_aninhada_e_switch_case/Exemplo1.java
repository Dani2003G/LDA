import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        double media;
        int frequencia;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua frequência: ");
        frequencia = sc.nextInt();
        System.out.print("Digite a sua média: ");
        media = sc.nextDouble();

        if(frequencia < 75) {
            System.out.println("Reprovado por falta");
        } else {
            if(media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado por nota");
            }
        }

        sc.close();
    }
}
