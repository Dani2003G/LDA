/* 
Faça um procedimento que recebe como parâmetros o peso e a altura de uma pessoa,
calcula e mostra o valor de seu IMC (índice de massa corporal). Sabendo que:

IMC = peso /altura²

Faça um algoritmo que solicite o peso e altura de uma pessoa, em seguida calcule e
mostre o IMC utilizando o procedimento criado.
*/

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        double altura, peso;

        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura em metros: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso em kg: "));

        JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", imc(altura, peso)));
    }

    public static double imc(double altura, double peso) {
        return peso / (altura * altura);
    }
}
