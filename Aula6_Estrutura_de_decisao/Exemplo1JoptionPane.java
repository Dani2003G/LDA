/*
Crie um algoritmo e um programa em Java que solicite ao usuário a sua idade e
mostre se ele pode ter CHN
*/
import javax.swing.JOptionPane;

public class Exemplo1JoptionPane {
    public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade: "));

        if( idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você pode ter CNH");
        }
    }
}
