import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o seu peso em Kg: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu imc é: %.2f Kg/m²", imc);

        sc.close();
    }
}
