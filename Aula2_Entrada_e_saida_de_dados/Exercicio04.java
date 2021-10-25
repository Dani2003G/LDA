/*
Faça um programa que receba o salário de um funcionário, 
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double salario_atual, novo_salario;
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o seu salário atual: ");
        salario_atual = sc.nextDouble();

        novo_salario = salario_atual * 0.25 + salario_atual;

        System.out.printf("O seu novo salário é de: %.2f reais", novo_salario);
        sc.close();
    }
}