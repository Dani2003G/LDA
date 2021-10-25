/*
Faça um programa que receba três notas, calcule e mostre a média aritmética.
*/

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digita a primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digita a segunda nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digita a terceira nota: "));

        media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, String.format("A sua média é: %.2f", media));
    }
}