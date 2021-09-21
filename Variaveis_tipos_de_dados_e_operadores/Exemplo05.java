/* 
A luz do sol, ao incidir num prédio, projeta uma sombra chão, formando um
triângulo retângulo como o mostrado na figura abaixo. Faça um programa solicite
o comprimento da sombra e o ângulo de inclinação dos raios solares, calcule e
mostre a altura do prédio.
*/
import javax.swing.JOptionPane;

public class Exemplo05 {
    public static void main(String[] args) {
        double angulo, altura, comprimento;

        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento da sombra em metros: "));
        angulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o ângulo de inclinação dos raios solares em graus: "));

        angulo = Math.toRadians(angulo);

        altura = comprimento * Math.tan(angulo);

        JOptionPane.showMessageDialog(null, String.format("A alturta do prédio é: %.2f metros", altura));
    }
}
