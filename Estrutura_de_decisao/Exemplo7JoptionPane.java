import javax.swing.JOptionPane;

/* 
aça uma calculadora simples em Java que solicite ao usuário dois valores reais (a, b)
e uma opção (1-Soma; 2-Subtração; 3- Divisão; 4- Multiplicação). Após, calcular e exibir
o resultado conforme a opção selecionada.
*/

public class Exemplo7JoptionPane {
    public static void main(String[] args) {
        int op;
        double num1, num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione uma opção: (+ = 1), (- = 2), (/ = 3) ou (* = 4): "));

        if(op == 1) {
            JOptionPane.showMessageDialog(null, String.format("%.2f + %.2f = %.2f", num1, num2, (num1 + num2)));
        } else if (op == 2) {
            JOptionPane.showMessageDialog(null, String.format("%.2f - %.2f = %.2f", num1, num2, (num1 - num2)));
        } else if (op == 3) {
            JOptionPane.showMessageDialog(null, String.format("%.2f / %.2f = %.2f", num1, num2, (num1 / num2)));
        } else if (op == 4) {
            JOptionPane.showMessageDialog(null, String.format("%.2f * %.2f = %.2f", num1, num2, (num1 * num2)));;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um opção válida");
        }
    }
}
