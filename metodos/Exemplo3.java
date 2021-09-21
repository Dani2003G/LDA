/*
Faça um algoritmo que leia dois valores inteiros representando, respectivamente, um
valor de hora e um de minutos e informe quantos minutos se passaram desde o início do
dia. Faça um método com retorno que calcule a quantidade de minutos que se passaram.
*/
import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        int horas, minutos, totalMinutos;
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas:"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os minutos:"));

        totalMinutos = calcularMinutos(horas, minutos);

        JOptionPane.showMessageDialog(null, "Passaram-se " + totalMinutos + " minutos desde o inicio do dia");
    }

    public static int calcularMinutos(int horas, int minutos) {
        int totalMinutos;
        totalMinutos = horas * 60 + minutos;
        return totalMinutos;
    }
    
}