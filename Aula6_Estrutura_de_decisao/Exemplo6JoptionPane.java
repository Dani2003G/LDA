import javax.swing.JOptionPane;

/*
Crie um algoritmo e um programa em Java que solicite ao usuário três valores inteiros
(A, B e C) e verifica se o valor armazenado em B é o menor
*/

public class Exemplo6JoptionPane {
    public static void main(String[] args) {
        double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de c: "));

        if(a > b && b < c) {
            JOptionPane.showMessageDialog(null, "O valor armazenado em b é maior");
        } else {
            JOptionPane.showMessageDialog(null, "O valor armazenado em b não é maior");
        }
    }    
}
