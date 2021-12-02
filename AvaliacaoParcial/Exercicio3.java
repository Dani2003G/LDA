/* 
Faça um programa em Java que solicite ao usuário a quantidade de quilômetros que um carro
percorreu em 15 dias e armazene em um vetor (cada posição do vetor corresponde a um dia). Após fazer a leitura dos dados,
calcule e mostre a quantidade média de quilômetros percorridos nesses 15 dias e quantos dias a quantidade de quilômetros
percorridos estão acima da média (ou seja, quantos valores armazenados no vetor estão acima da média).
Obs.: É obrigatório o uso de estrutura de repetição e vetor e formatação da média com duas casas decimais. 
*/
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double km[] = new double[15];
        double media = 0;
        int i, qtde = 0;

        for(i = 0; i < 15; i++){
            km[i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Digite a quantidade de km pecorridos no %d° dia: ", (i + 1))));
            media += km[i];
        }

        media /= 15;

        for(i = 0; i < 15; i++){
            if(km[i] > media)
                qtde++;
        }

        JOptionPane.showMessageDialog(null, String.format("A média de km pecorridos nestes 15 dias é %.2f\nA quantidade dias acima da média é %d", media, qtde));
    }
}
// RGM: 25496581