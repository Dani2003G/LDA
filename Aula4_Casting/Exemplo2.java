/* 
Faça um programa que leia quatro números inteiros e, a seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D, segundo a fórmula:
DIFERENÇA = (A*B – C*D)
Entrada: Contém quatro números inteiros.
Saída: Imprimir a mensagem “diferença = “ seguida do resultado
*/
import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "));

        diferenca = a * b - c * d;

        JOptionPane.showMessageDialog(null, String.format("Entrada: a = %d b = %d c = %d d = %d" 
                                            + "\n Saida: \n diferença = %d", a, b, c, d, diferenca));
    }
}
