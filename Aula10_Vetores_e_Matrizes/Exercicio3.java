/* 
Faça um programa algoritmo que solicite ao usuário, enquanto o mesmo desejar,
números e armazene-os em um vetor. Após a entrada de dados, somar os valores do
vetor, calcular e mostrar a média. Calcule e mostre quantos números armazenados no
vetor estão acima da média.
*/
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double vetor[];
        double media = 0;
        int qtde = 0, i, n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de números que você deseja armazenar no vetor: "));
        vetor = new double[n];

        for(i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d° número: ", (i + 1))));
            media += vetor[i];
        }

        media /= n;

        for(i = 0; i < n; i++){
            if(vetor[i] > media){
                qtde++;
            }
        }

        JOptionPane.showMessageDialog(null, String.format("A média dos números é %.2f\nTem %d números acima da média", media, qtde));
    }
}
