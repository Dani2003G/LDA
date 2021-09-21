import javax.swing.JOptionPane;

public class Exemplo07 {
    public static void main(String[] args) {
        float altura, peso, imc;
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a sua altura em metros: "));
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a seu peso em Kg: "));

        imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, String.format("O seu imc é: %.2f Kg/m²", imc));
    }
}
