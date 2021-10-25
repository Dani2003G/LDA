import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        double num, soma;
        int i;

        soma = 0;

        for(i = 0; i < 10; i++) {
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: ", "Digite aqui!"));

            soma += num;
        }

        JOptionPane.showMessageDialog(null, String.format("A soma dos números é de %.2f", soma));
    }
}
