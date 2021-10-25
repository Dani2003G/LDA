import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso em Kg: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura em metros: "));

        imc = peso / (altura * altura);

        if(imc < 20) {
            JOptionPane.showMessageDialog(null, "Você está na categoria: Abaixo do peso");
        } else if (imc < 25) {
            JOptionPane.showMessageDialog(null, "Você está na categoria: Peso normal");
        } else if (imc < 30) {
            JOptionPane.showMessageDialog(null, "Você está na categoria: Sobrepeso");
        } else if (imc < 40) {
            JOptionPane.showMessageDialog(null, "Você está na categoria: Obeso");
        } else {
            JOptionPane.showMessageDialog(null, "Você está na categoria: Obeso mórbido");
        }
    }
}