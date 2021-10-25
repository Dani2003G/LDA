import javax.swing.JOptionPane;

/* 
Escreva um método chamado converteDolar que recebe dois parâmetros reais, um é o
valor total em reais (R$) e o segundo a cotação do dólar. O método deve calcular e
retornar o valor em Dólar ($).
Faça um algoritmo principal que solicite ao usuário o valor que o mesmo deseja converter
e a cotação do dólar e usando o método definido acima, mostre o valor em dólar.
*/
public class Exercicio10 {
    public static void main(String[] args) {
        double real, dolar;

        real = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em reais que você deseja converter para dolar: "));
        dolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da cotação do dolar: "));

        JOptionPane.showMessageDialog(null, String.format("R$ %.2f convertido para dolár ficou: %.2f $", real, converteDolar(real, dolar)));
    }

    public static double converteDolar(double real, double dolar) {
        return real / dolar;
    }
}
