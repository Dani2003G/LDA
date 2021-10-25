/* 
Elabore um algoritmo para calcular as raízes de uma equação de segundo grau
ax²+bx+c, conhecidos os coeficientes a, b, c.
Lembre que as raízes x1
e x2
são calculadas pela fórmula

x1, x2 = (-b + Math.sqrt(delta)) / (2 * a)
delta = Math.pow(b, 2) - 4 * a * c

Elabore métodos separados, funções, getDelta(a,b,c), getX1(a,b,c) e getX2(a,b,c). Também,
elabore o método principal para efetuar a leitura de dados e chamar às restantes funções.
*/
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor C: "));

        delta = getDelta(a, b, c);
        x1 = getX1(delta, a, b);
        x2 = getX2(delta, a, b);

        JOptionPane.showMessageDialog(null, String.format("Delta = %.2f \n"
                                                        + "X1 = %.2f \n"
                                                        + "X2 = %.2f", delta, x1, x2));
    }

    public static double getDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double getX1(double delta, double a, double b) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static double getX2(double delta, double a, double b) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
