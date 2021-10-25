/*
Escreva um algoritmo que leia um grupo de valores (não sabemos quantos são) para
calcular e visualizar a média desses valores e, também, determinar e visualizar o maior
deles. Utilize uma estrutura de repetição ENQUANTO ou REPITA.
*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int i, qtde;
        double num, media, maior;

        qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos dados serão processados: ", "Digite aqui!"));

        i = 1;

        maior = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: ", "Digite aqui!"));
        media = maior;

        while(i < qtde) {
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: ", "Digite aqui!"));
            media += num;
            if(num > maior) {
                maior = num;
            }
            i++;
        }

        media /= qtde;

        JOptionPane.showMessageDialog(null, String.format("A média dos valores é de %.2f e o maior valor é %.2f", media, maior));
    }
}
