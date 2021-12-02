import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        double salario[] = new double [10];
        double media = 0, maior;
        int qtde = 0, i;

        for(i = 0; i < 10; i++){
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Digite o salário do %d° funcionário: ", (i + 1))));
        }

        maior = salario[0];

        for(i = 0; i < 10; i++){
            if(salario[i] > maior)
                maior = salario[i];
        }

        for(i = 0; i < 10; i++){
            media += salario[i];
        }
        
        media /= 10;

        for(i = 0; i < 10; i++){
            if(salario[i] < 850)
                qtde++;
        }

        JOptionPane.showMessageDialog(null, String.format("A média dos salário dos funcionários é %.2f\nO maior salário é %.2f\n"
                                                        + "A quantidade de funcionários com salários abaixos de 850R$ é %d funcionários", media, maior, qtde));
    }
}