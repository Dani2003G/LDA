/* 
Elabore um algoritmo para calcular as raízes de uma equação de segundo grau, mas
verifique nesta versão que delta deverá ser um valor positivo, para poder calcular e
visualizar as raízes reais da equação. Caso contrário, visualize uma mensagem explicando
que não serão calculadas as raízes.
*/
import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de C: "));

        delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0) {
            JOptionPane.showMessageDialog(null, "Não será possivel calcular as raizes de delta, pois o delta deu negativo e não existe raíz de número negativo");
        } else {
            x1 = (- b + Math.sqrt(delta)) / (2 * a); 
            x2 = (- b - Math.sqrt(delta)) / (2 * a); 

            JOptionPane.showMessageDialog(null, String.format("X1 = %.2f \nX2 = %.2f", x1, x2));
        }
    }
}
