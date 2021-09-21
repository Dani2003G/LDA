/*
Crie um algoritmo e um programa em Java que solicite ao usuário um número e
mostre se o mesmo é par ou ímpar.
*/
import javax.swing.JOptionPane;

public class Exemplo3JoptionPane {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        if(num % 2 == 0) {
            JOptionPane.showMessageDialog(null, String.format("%d é par", num));
        } else {
            JOptionPane.showMessageDialog(null, String.format("%d é impar", num));
        }
    }
}