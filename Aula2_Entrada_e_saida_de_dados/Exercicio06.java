/* 
Faça um programa que calcule e mostre a área de um triângulo a partir da leitura da base e altura (em cm). 
Sabe-se que: á rea = (base * altura)/2.
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double area, base, altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triangulo em cm: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura do triangulo em cm: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;
        
        System.out.printf("A área do triangulo é de: %.2f cm", area);
        sc.close();
    }
}