/* 
aça uma calculadora simples em Java que solicite ao usuário dois valores reais (a, b)
e uma opção (1-Soma; 2-Subtração; 3- Divisão; 4- Multiplicação). Após, calcular e exibir
o resultado conforme a opção selecionada.
*/
import java.util.Scanner;

public class Exemplo7Scanner {
    public static void main(String[] args) {
        int op;
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.print("Selecione uma opção: (+ = 1), (- = 2), (/ = 3) ou (* = 4): ");
        op = sc.nextInt();

        if(op == 1) {
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
        } else if (op == 2) {
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
        } else if (op == 3) {
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
        } else if (op == 4) {
            System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
        } else {
            System.out.println("Digite um opção válida");
        }

        sc.close();
    }
}
