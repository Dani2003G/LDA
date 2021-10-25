/*
Elabore um programa Java que leia as dimensões de uma caixa (largura, altura e
profundidade, os três valores fornecidos em centímetros) e calcule o volume dessa caixa
em m³.
*/
import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        float largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura da caixa em cm: ")); 
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura da caixa em cm: ")); 
        float profundidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a profundidade da caixa em cm: "));

        JOptionPane.showMessageDialog(null, "O volume da caixa é: " + volume(largura, altura, profundidade) + "M³");
    }
    
    public static float volume(float largura, float altura, float profundidade) {
        return largura/100 * altura/100 * profundidade/100;
    }
}
