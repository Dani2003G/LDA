/* 
Elabore um algoritmo que que leia o destino do passageiro partindo de São Paulo e se
a viagem inclui retorno (ida e volta). Ao final informar o preço da passagem 
*/
import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int destino, retorno;

        destino = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu destino \n"
                                                                + "1 - Região Norte \n2 - Região Nordeste \n"
                                                                + "3 - Região Centro-Oeste \n 4 - Região Sul"));
        retorno = Integer.parseInt(JOptionPane.showInputDialog(null, "A sua viagem será ida e volta? \n 1 - Sim. 2 - Não"));

        switch(destino) {
            case 1:
                if(retorno == 1)
                    JOptionPane.showMessageDialog(null, "Valor da viagem ida e volta é de: 900,00 R$");
                if(retorno != 1)
                JOptionPane.showMessageDialog(null, "Valor da viagem ida é de: 500,00 R$");
                break;
            case 2:
                if(retorno == 1)
                    JOptionPane.showMessageDialog(null, "Valor da viagem ida e volta é de: 650,00 R$");
                if(retorno != 1)
                JOptionPane.showMessageDialog(null, "Valor da viagem ida é de: 350,00 R$");
                break;
            case 3:
                if(retorno == 1)
                    JOptionPane.showMessageDialog(null, "Valor da viagem ida e volta é de: 600,00 R$");
                if(retorno != 1)
                JOptionPane.showMessageDialog(null, "Valor da viagem ida é de: 350,00 R$");
                break;
            case 4:
                if(retorno == 1)
                    JOptionPane.showMessageDialog(null, "Valor da viagem ida e volta é de: 550,00 R$");
                if(retorno != 1)
                JOptionPane.showMessageDialog(null, "Valor da viagem ida é de: 600,00 R$");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Destino inválido");
        }
    }
}
