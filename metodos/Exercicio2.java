/* 
Escreva um método com retorno que receba como parâmetros os lados de um
retângulo, calcula e retorna o valor de sua área.
area = lado*lado
Faça um algoritmo principal que solicite os valores dos lados de um retângulo ao usuário,
e utilizando a função definida acima, calcule e mostre o valor de área.
*/
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado A do retângulo: "));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado B do retângulo: "));

        JOptionPane.showMessageDialog(null, String.format("A área do retângulo é de: %.2f", area(ladoA, ladoB)));
    }

    public static double area(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }
}
