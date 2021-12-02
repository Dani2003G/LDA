import javax.swing.JOptionPane;

/* 
Faça um programa em Java que leia os doze salários recebidos por um funcionário durante um ano, calcule e
exiba na tela quanto ele receberá de 13º salário e 1/3 de férias. Para os cálculos, utilize as seguintes definições:
▪ O 13º salário deverá ser igual à média dos salários recebidos no ano.
▪ Para o cálculo de 1/3 de férias, faça a média dos salários * 1/3.
*/
public class Exercicio1 {
    public static void main(String[] args) {
        double salario, media = 0, ferias;
        int i;

        for(i=0; i < 12; i++){
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Digite o %d° salário: ", (i + 1))));
            media += salario;
        }
        media /= 12;
        ferias = media * 1 / 3;

        JOptionPane.showMessageDialog(null, String.format("Seu 13° salário é de: R$ %.2f \n1/3 das férias é de: R$ %.2f",media, ferias));
    }
}