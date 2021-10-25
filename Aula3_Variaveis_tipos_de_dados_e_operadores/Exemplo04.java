/* 
Faça uma programa em Java que peça do usuário um valor em graus para um ângulo.
Converta-o para radianos e, usando funções da biblioteca Math, imprima o seno,
cosseno e tangente deste ângulo.
*/
import javax.swing.JOptionPane;
public class Exemplo04 {
    public static void main(String[] args){
        double angulo, seno, cosseno, tangente;
        angulo = Double.parseDouble(JOptionPane.showInputDialog(null, 
                                                    "Digite ângulo em graus:"));
        angulo = Math.toRadians(angulo);//convertendo para radianos        
        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);
        JOptionPane.showMessageDialog(null, String.format(
                        "seno = %.2f\ncosseno = %.2f\ntangente = %.2f", seno, cosseno, tangente));
    }
}