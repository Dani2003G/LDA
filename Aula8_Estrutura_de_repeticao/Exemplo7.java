import javax.swing.JOptionPane;

public class Exemplo7 {
    public static void main(String[] args) {
        int num, soma;

        soma = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: (0 para sair) ", "Digite aqui!"));

            if(num % 2 != 0)
                soma += num;
        } while(num != 0);

        JOptionPane.showMessageDialog(null, String.format("A soma dos ímpares é %d", soma));
    }
}
