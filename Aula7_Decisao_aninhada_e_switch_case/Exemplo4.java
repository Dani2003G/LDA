import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        double num1, num2;
        int operacao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.print("Digite a operação que você deseja fazer: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n");
        operacao = sc.nextInt();

        switch(operacao) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case 4:
                if(num2 != 0)
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                else 
                    System.out.println("Não é possível dividir por 0");
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();

    }
}
