/* 
- Uma empresa comercializa um produto e deseja fazer uma estatística do último ano de
suas vendas
Desenvolver um algoritmo que seja capaz de:
a) Encontrar o menor e maior quantidade vendida.
b) Encontrar a média vendida neste período.
c) Determinar quantos dias a média vendida foi superada.
*/
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int vendasDia[] = new int [364];
        int i, menor, menorDia, maior, maiorDia, periodo, qtde = 0;
        double media = 0;

        for(i = 0; i < vendasDia.length; i++){
            vendasDia[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidades de produtos vendidos no dia " + (i + 1) + ":"));
            media += vendasDia[i];
        }

        menor = vendasDia[0];
        menorDia = 1;
        maior = vendasDia[0];
        maiorDia = 1;
        periodo = vendasDia.length;
        media /= vendasDia.length;

        for(i = 0; i < vendasDia.length; i++) {
            if(vendasDia[i] < menor){
                menor = vendasDia[i];
                menorDia = i + 1;
            }
            if(vendasDia[i] > maior){
                maior = vendasDia[i];
                maiorDia = i + 1;
            }
            if(vendasDia[i] > media){
                qtde++;
            }
        }

        JOptionPane.showMessageDialog(null, String.format("A menor venda foi no dia %d, só foi vendia %d unidades\n"
                                                        + "A maior venda foi no dia %d, foram vendidas %d unidades\n"
                                                        + "A média de vendas durante esse período de %d dias é de %.2f unidades\n"
                                                        + "A quantidade de dias que foram vendidos diversas unidade acima da média é de %d dias",
                                                        + menorDia, menor, maiorDia, maior, periodo, media, qtde));

    }
}