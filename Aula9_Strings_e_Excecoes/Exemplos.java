import javax.swing.JOptionPane;

public class Exemplos {
    public static void main(String[] args) {
        String resp;
        resp = JOptionPane.showInputDialog(null, "Digite sim para continuar: ");
        if(resp.equalsIgnoreCase("sim"))
            JOptionPane.showMessageDialog(null, "Olá seja bem-vindo!");
        else
            JOptionPane.showMessageDialog(null, "Você não digitou sim");
    }
}