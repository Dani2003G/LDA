/* 
Faça um programa que leia dois números inteiros e, a seguir, calcule o produto entre
eles, atribuindo essa operação à variável produto. No final, deverá ser exibido a variável
produto com a mensagem correspondente.
Entrada: Contém dois números inteiros.
Saída: Imprimir a variável produto
*/
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        int num1, num2, produto;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        produto = num1 * num2;

        System.out.printf("Entrada: \n %d \n %d \n Saida: \n produto = %d", num1, num2, produto);
        sc.close();
    }
}