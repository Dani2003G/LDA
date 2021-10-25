/* 
Escreva um método que receba dois números inteiros e retorne a soma deles. Faça um
programa que solicite dois números e utilize o método definido acima para exibir o
resultado da soma
*/
import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        int num1, num2, soma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));

        soma = soma(num1, num2);

        JOptionPane.showMessageDialog(null, String.format("A soma do número %d + %d é de: %d", num1, num2 ,soma));
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    } 

}
