/* 
Faça um programa que leia três números inteiros e apresente o maior deles, sem
utilizar nenhuma estrutura condicional (if) ou função (max). A fórmula a seguir apresenta
o cálculo para verificar o maior entre dois números:
maior (x + y) / 2 + Math.abs((x - y) / 2)
Entrada: Contém três números.
Saída: Imprimir na tela o maior dos três números inteiros
*/
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        double x, y, z, maior;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor x: ");
        x = sc.nextDouble();
        System.out.print("Digite o valor y: ");
        y = sc.nextDouble();
        System.out.print("Digite o valor z: ");
        z = sc.nextDouble();

        maior = (x + y) / 2 + Math.abs((x - y) / 2);
        maior = (maior + z) / 2 + Math.abs((maior - z) / 2);

        System.out.printf("x = %.0f, y = %.0f, z = %.0f \n Maior = %.0f", x, y, z, maior);
        sc.close();
    }
}