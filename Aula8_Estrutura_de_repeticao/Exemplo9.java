import java.util.Random;

import javax.swing.JOptionPane;

public class Exemplo9 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int num = gerador.nextInt(100);
        int x, i = 0;

        do {
            i++;

            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 100: "));

            if(x == num) {
                JOptionPane.showMessageDialog(null, String.format("Parabéns, você acertou em %d tentativas", i));
            }
            else if(x < num) {
                JOptionPane.showMessageDialog(null, "O número pensado é maior");
            } else {
                JOptionPane.showMessageDialog(null, "O número pensado é menor");
            }
        } while(x != num);
    }
}
