/*
Escreva um programa em Java que calcule as duas raízes de uma equação de 2º grau ax²+bx+c, 
conhecendo os valores dos coeficientes da mesma (a, b, c). Suponha que as raízes são reais.
Lembre-se que para calcular as duas raízes:
*/

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int a, b, c, delta, x1, x2;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de c:"));

        delta = (int) (Math.pow(b, 2) - 4 * a * c);

        x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
        x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));

        JOptionPane.showMessageDialog(null, String.format("X1 = %d \n X2 = %d", x1, x2));
    }
}
