/* 
Escreva um programa que obtenha o valor de um produto e, utilizando um método,
aplique nesse valor um desconto de 9% e mostre o novo valor.
*/
import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double valorProduto;

        valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto: "));

        JOptionPane.showMessageDialog(null, String.format("O produto de %.2f com 9%% de desconto ficou: %.2f", valorProduto, desconto(valorProduto)));
    }

    public static double desconto(double valorProduto) {
        return valorProduto - valorProduto * 0.09;
    }
}
