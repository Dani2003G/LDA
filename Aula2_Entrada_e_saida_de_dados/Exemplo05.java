import javax.swing.JOptionPane;

public class Exemplo05 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome);
    }
}
