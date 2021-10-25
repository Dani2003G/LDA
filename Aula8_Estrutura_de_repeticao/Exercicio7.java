/*
Temos um grupo de pessoas. Escreva um algoritmo que leia o sexo e a altura de cada
pessoa, calcule e mostre a altura média das mulheres e dos homens separadamente.
Utilize o comando de repetição que desejar.
*/
import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double altura, mediaH, mediaF;
        char sexo, res, qtdeH, qtdeF;

        res = 's';
        qtdeH = 0;
        qtdeF = 0;
        mediaF = 0;
        mediaH = 0;

        while(res == 's') {
            sexo = JOptionPane.showInputDialog(null, "Digite o sexo de pessoa: M/F ").toLowerCase().charAt(0);
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura de pessoa:"));
            if(sexo == 'm') {
                qtdeH += 1;
                mediaH += altura;
            } else {
                qtdeF += 1;
                mediaF += altura;
            }
            res = JOptionPane.showInputDialog(null, "Deseja continuar? S/N ").toLowerCase().charAt(0);
        }

        mediaH /= qtdeH;
        mediaF /= qtdeF;

        JOptionPane.showMessageDialog(null, String.format("A média da altura dos homens é %.2f \nA média da altura das mulheres é %.2f", mediaH, mediaF));
    }
}
