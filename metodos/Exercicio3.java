/* 
Construir um método que receba como parâmetros o valor de uma compra e a
quantidade de parcelas e calcula e retorna o valor da parcela, sabendo que a loja
acrescenta 5% de juros para as compras parceladas.
No algoritmo principal, solicite para o usuário o valor de uma compra e a quantidade de
parcelas e utilizando o método descrito acima, mostre o valor da parcela.
*/
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double valorCompra, parcelas;

        valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra: "));
        parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de parcelas da compra: "));

        JOptionPane.showMessageDialog(null, String.format("O valor das parcelas com juros de 5%% é de: %.2f", parcela(valorCompra, parcelas)));
    }

    public static double parcela(double valorCompra, double parcelas) {
        return valorCompra / parcelas + valorCompra / parcelas * 0.05;
    }
}