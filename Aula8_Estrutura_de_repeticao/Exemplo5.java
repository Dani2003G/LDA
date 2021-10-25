import javax.swing.JOptionPane;

public class Exemplo5 {
    public static void main(String[] args) {
        int i;
        double nota1, nota2, media;

        i = 1;

        while(i <= 10) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: ", "Digite aqui!"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: ", "Digite aqui!"));

            media = (nota1 + nota2) / 2;

            JOptionPane.showMessageDialog(null, String.format("O %d° aluno ficou com média = %.2f", i, media));

            i += 1;
        }
    }
}
