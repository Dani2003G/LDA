/*
 Faça um programa em Java que solicite ao usuário o valor de compra (valorc) de um produto, calcule e mostre
o valor de venda (valorv). O valor de venda do produto é acrescido de 15% sobre o valor de compra, somando-se a taxa de
entrega (taxae)
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double valorc, taxae;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        valorc = sc.nextDouble();

        if(valorc <= 100)
            taxae = valorc * 1.15 + 10;
        else if(valorc <= 250)
            taxae = valorc * 1.15 + 17;
        else if(valorc <= 950)
            taxae = valorc * 1.15 + 20;
        else {
            taxae = valorc * 1.15 + 25;
        }

        System.out.printf("O valor da compra é %.2f", taxae);
        sc.close();
    }
}