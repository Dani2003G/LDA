/* 
Faça um programa que receba o salário base de um funcionário, calcule e mostre seu
salário a receber, sabendo-se que o funcionário tem gratificação de R$ 50 e paga
imposto de 10% sobre o salário base.
*/
import javax.swing.JOptionPane;

public class Exemplo02 {
    public static void main(String[] args) {
        double salario;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salário: "));

        salario = salario + 50 - (salario * 0.10);

        JOptionPane.showMessageDialog(null, String.format("O seu salário é: %.2f", salario));
    }
}
