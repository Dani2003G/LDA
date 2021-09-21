/*
Crie um programa em Java que solicite duas notas de um aluno ao usuário, calcule a
média e mostre se o mesmo está aprovado (média >=6.0) ou reprovado caso contrário.
*/
import javax.swing.JOptionPane;

public class Exemplo4JoptionPane {
    public static void main(String[] args) {
        double nota1, nota2, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua segunda nota: "));

        media = (nota1 + nota2) / 2;

        if(media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado!", "UnicSul", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado!", "UnicSul", 2);
        }
    }
}