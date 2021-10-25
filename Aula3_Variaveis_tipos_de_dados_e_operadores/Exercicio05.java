/*
Escreva um programa em Java que obtenha uma temperatura em graus Celsius, 
calcule e mostre a respectiva temperatura nas escalas Fahrenheit e Kelvin. Utilize as fórmulas abaixo:
Tf = 1,8 * Tc + 32
Tk = Tc + 273
*/

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int celsius, fahrenheit, kelvin;

        celsius = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a temperatura em graus celsius"));

        fahrenheit = (int) (1.8 * celsius + 32);
        kelvin = celsius + 273;

        JOptionPane.showMessageDialog(null, String.format("%d °F \n %d K", fahrenheit, kelvin));
    }
}
