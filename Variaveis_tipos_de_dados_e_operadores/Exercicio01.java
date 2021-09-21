/*
Desenvolva um programa em Java que solicite ao usuário os valores dos lados de um retângulo e 
calcule e mostre seu perímetro e sua área.
*/

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        double base, altura, area, perimetro;
        
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do retangulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do retangulo: "));

        area = base * altura;
        perimetro = 2 * (base + altura);

        JOptionPane.showMessageDialog(null, String.format("Área: %.2f \n Perimetro: %.2f", area, perimetro));
    }
}
