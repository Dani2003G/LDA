/* 
Escreva um programa para calcular o valor de uma prestação em atraso (prestacao). 
Para isso, obtenha o valor da prestação (valorPrestacao), 
a porcentagem de multa pelo atraso (multa) e a quantidade de dias de atraso (qtdeDias). 
Calcular e mostrar o valor da prestação atualizado, sabendo que: 
prestação = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)
*/

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        float prestacao, valorPrestaca, multa;
        int qtdeDias;

        valorPrestaca = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da prestação: "));
        multa = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da multa: "));
        qtdeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de dias atrasados: "));

        prestacao = valorPrestaca + (valorPrestaca + (multa / 100) * qtdeDias);

        JOptionPane.showMessageDialog(null, String.format("O valor a pagar de prestação é de: %.2f", prestacao));
        
    }
}