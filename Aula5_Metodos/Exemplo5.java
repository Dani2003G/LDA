/*
- Escreva um método com retorno que receba como parâmetros a base
e altura de um triângulo, calcule e retorne o valor de sua área.
Faça um algoritmo que solicite a base e altura de um triângulo ao
usuário, e utilizando a função definida acima, calcule e retorne o valor da
área.
Após o cálculo anterior, defina outros valores no código de base e altura
e utilizando o mesmo método acima, mostre o valor da área.

*/
import javax.swing.JOptionPane;

public class Exemplo5 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do triangulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do triangulo: "));

        JOptionPane.showMessageDialog(null, "A área do triangulo é: " + area(base, altura));
    }

    public static Double area(double base, double altura) {
        return base * altura / 2;
    }
}
