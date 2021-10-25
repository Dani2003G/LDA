import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        String login, loginUser, senha, senhaUser;

        login = "amin1454812";
        senha = "yhd45svgf11as74d1a";

        loginUser = JOptionPane.showInputDialog(null, "Digite o nome de usuário: ");
        senhaUser = JOptionPane.showInputDialog(null, "Digite a senha de usuário: ");

        if(loginUser.equals(login) && senhaUser.equals(senha))
            JOptionPane.showMessageDialog(null, "Acesso liberado!");
        else
            JOptionPane.showMessageDialog(null, "Acesso negado!");
    }
}
