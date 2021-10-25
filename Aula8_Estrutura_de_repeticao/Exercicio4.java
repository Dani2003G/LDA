import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int n, i;
        double num, media;

        media = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade da valores a serem processados: "));

        for(i = 0; i < n; i++) {
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor: "));
            media += num;
        }

        media /= n;

        JOptionPane.showMessageDialog(null, String.format("A média dos valores é de %.2f", media));
    }
}
