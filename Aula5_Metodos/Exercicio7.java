/*
A loja de pregos Pregão comercializa dois tipos de pregos, 
o telheiro e o quadrado. Cada telheiro custa R$ 1,05 e o quadrado custa R$ 0,51.
Ao final do dia, o gerente quer saber quanto arrecadou com a venda dos pregos do tipo 
telheiro e quadrado (juntos), e quanto deve separar de comissão (10% do total arrecadado).
Faça um programa para obter as quantidades de pregos do tipo telheiro e quadrado que
foram vendidos, calcule e mostre o valor arrecadado com as vendas e o valor da
comissão.
*/

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        int telheiro, quadrado; 
        double arrecadacao, comissao;

        telheiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de pregos telheiros vendidos hoje: "));
        quadrado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de pregos quadrados vendidos hoje: "));

        arrecadacao = arrecadacao(telheiro, quadrado);
        comissao = comissao(arrecadacao);

        JOptionPane.showMessageDialog(null, String.format("O gerente arrecadou R$ %.2f com as vendas dos pregos, "
                                            + "ele deve separar um comissão de R$ %.2f para o funcionario", arrecadacao, comissao));
    }

    public static double arrecadacao(double telheiro, double quadrado) {
        return telheiro * 1.05 + quadrado * 0.51;
    }

    public static double comissao(double arrecadacao) {
        return arrecadacao * 0.1;
    }
}