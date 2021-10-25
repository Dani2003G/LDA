import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        double salario, bonus;
        int percentual;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário bruto: ", "Digite aqui"));

        percentual = (salario > 1000) ? 10 : 15;
        bonus = salario * percentual / 100;

        JOptionPane.showMessageDialog(null, String.format("Parabéns você receberá %d%% de bonus, R$ %.2f",percentual, bonus));
    }
}