/*
Faça um programa que solicite ao usuário um número inteiro, calcule e mostre a raiz
quadrada desse número. O programa deverá verificar antes se o número digitado é
positivo, exibindo uma mensagem de alerta, caso seja negativo.
*/
import javax.swing.JOptionPane;

public class Exemplo5JoptionPane {
    public static void main(String[] args) {
        int num;
        double raiz;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        if(num >= 0) {
            raiz = Math.sqrt(num);
            JOptionPane.showMessageDialog(null, String.format("A raiz de %d é: %.2f", num, raiz));
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível calcular a raiz de um número negativo");
        }
    }
}
