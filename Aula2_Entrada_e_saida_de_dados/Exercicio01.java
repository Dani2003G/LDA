/*
Crie um programa que solicite ao usuário a sua idade expressa em anos, 
meses e dias (variáveis separadas). Calcule e mostre a idade expressa apenas em dias. 
Para isso considere 1 ano = 365 dias e 1 mês = 30 dias.
*/

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int anos, meses, dias;
        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade em anos: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade em meses: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade em dias: "));

        dias = anos * 365 + meses * 30 + dias;

        JOptionPane.showMessageDialog(null, "você tem " + dias + " dias de vida");
    }
}