/*
Elabore um algoritmo que implemente uma calculadora com as funções de somar,
subtrair, multiplicar e dividir. O programa deverá solicitar ao usuário os dois valores, e
perguntar qual a operação pretendida (‘+’, ‘-‘, ‘*’ ou ‘/’ ) e a seguir calcular e mostrar o
resultado. Obs: Obrigatório utilizar a estrutura escolha...caso 
*/
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double num1, num2;
        int op;

        Scanner sc = new Scanner(System.in);

       System.out.print("Digite o primeiro número: ");
       num1 = sc.nextDouble(); 
       System.out.print("Digite o segundo número: ");
       num2 = sc.nextDouble(); 
       System.out.println("Digite a operação que deseja fazer \n1 - + \n2 - -\n3 - *\n4 - /");
       op = sc.nextInt(); 

       switch(op) {
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
                    System.out.println("Não é possível dividir um número por 0");
                break;
            default:
                System.out.println("Operador inválido");  
       }

       sc.close();
    }
}
