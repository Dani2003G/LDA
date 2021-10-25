/*
Faça um programa que receba o salário base de um funcionário, 
calcule e mostre o salário a receber, sabendo-se que o funcionário tem 
gratificação de 5% sobre o salário base e paga imposto de 7% também sobre o salário base
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double salarioBase, salarioReceber;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário base: ");
        salarioBase = sc.nextDouble();

        salarioReceber = salarioBase + salarioBase * 0.05 - salarioBase * 0.07;

        System.out.printf("O seu salário final é de: %.2f reais", salarioReceber);
        sc.close();
    }
}