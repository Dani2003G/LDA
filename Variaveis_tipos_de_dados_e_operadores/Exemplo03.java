/* 
Faça um programa que leia dois valores inteiros representando, respectivamente, um valor de
hora e um de minutos e informe quantos minutos se passaram desde o início do dia.
Entrada: Dois valores inteiros que representam a hora e os minutos;
Saída: Um valor inteiro que representa o total de minutos.
*/
import javax.swing.JOptionPane;

public class Exemplo03 {
    public static void main(String[] args) {
        int hora, minutos;
        hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas:"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os minutos:"));

        minutos = hora * 60 + minutos;

        JOptionPane.showMessageDialog(null, "Já se passaram " + minutos + " minutos desde o inicio do dia");
    }
}
