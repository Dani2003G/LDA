/* 
Faça um programa que receba três notas, calcule e mostre a média ponderada. 
Sabese que a primeira tem peso 1, a segunda peso 2 e a terceira peso 4.
*/
import javax.swing.JOptionPane;

public class Exemplo01 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, notaFinal;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));

        notaFinal = (nota1 * 1 + nota2 * 2 + nota3 * 4) / 7;

        JOptionPane.showMessageDialog(null, String.format("A sua nota final é: %.2f", notaFinal));
    }
}
