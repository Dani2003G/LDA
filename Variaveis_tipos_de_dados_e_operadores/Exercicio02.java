/* 
Escreva um programa em Java que solicite ao usuário o salário atual 
e mostre o salário acrescido de 5% de comissão.
*/

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double salario;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salário: "));

        salario = salario + salario * 0.05;

        JOptionPane.showMessageDialog(null, String.format("O seu salário com a comissão de 5%% fica %.2f", salario));
    }
}
