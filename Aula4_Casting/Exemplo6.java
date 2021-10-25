/* 
Faça um programa que leia valor inteiro em reais, calcule e apresente na tela o menor
número de notas (cédulas) possíveis nos quais o valor pode ser decomposto. Considere
as notas de: R$ 100, 50, 20, 10, 5, 2, 1
Entrada: Contém um número inteiro.
Saída: Exibir a quantidade mínima de cada cédula
*/
import javax.swing.JOptionPane;

public class Exemplo6 {
    public static void main(String[] args) {
        int um, dois, cinco, dez, vinte, cinquenta, cem, valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dinheiro que você tem: "));

        cem = valor / 100;
        cinquenta = (valor % 100) / 50;
        vinte = (valor % 50) / 20;
        dez = (valor % 50 % 20)/10;
        cinco = (valor % 10)/5;
        dois = (valor % 5)/2;
        um = (valor % 5 % 2);

        JOptionPane.showMessageDialog(null, String.format("%d notas de R$ 100 \n %d notas de R$ 50 \n"
                        + "%d notas de R$ 20 \n %d notas de R$ 10 \n %d notas de R$ 5 \n"
                        + "%d notas de R$ 2 \n %d notas de R$ 1", cem, cinquenta, vinte, dez, cinco, dois, um));
    }
}
