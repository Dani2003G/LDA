import javax.swing.JOptionPane;

/* 
Escreva um método chamado valorCofre que aceite três parâmetros inteiros chamados
vinteCinco, dez e cinco, que conterão a quantidade de moedas de 25, 10 e 5 centavos
respectivamente de um cofre. O método deve calcular e retornar o valor em reais (R$).
Faça um algoritmo principal que solicite ao usuário a quantidade de moedas de 25, 10 e 5
centavos e usando o método definido acima, mostre o valor em reais.
*/
public class Exercicio8 {
    public static void main(String[] args) {
        int vinteCinco, dez, cinco;

        vinteCinco = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de moedas de 25 centavos que você possue: "));
        dez = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de moedas de 10 centavos que você possue: "));
        cinco = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de moedas de 5 centavos que você possue: "));

        JOptionPane.showMessageDialog(null, String.format("Você possue no total R$ %.2f reais", valorCofre(vinteCinco, dez, cinco)));

    }

    public static double valorCofre(int vinteCinco, int dez, int cinco) {
        return vinteCinco * 0.25 + dez * 0.1 + cinco * 0.05;
    }
}
