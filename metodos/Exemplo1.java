/* 
- Escreva um método sem retorno (void) que receba como parâmetros um número e um
texto. Faça um programa que solicite um número e um texto ao usuário, e utilize o
método definido acima para exibir as informações digitadas na tela.
*/
import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {
        float num;
        String texto;

        num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número"));
        texto = (JOptionPane.showInputDialog(null, "Digite um texto"));
    
        exibirInformacoes(num, texto);
    }

    public static void exibirInformacoes(float num, String texto) {
        JOptionPane.showMessageDialog(null, String.format("Número digitado = %.2f \n Texo digitado %s", num, texto));
    }
}
