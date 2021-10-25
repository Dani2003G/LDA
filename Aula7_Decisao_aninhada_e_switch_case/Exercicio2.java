/* 
Na cidade de São Paulo a circulação de veículos é restrita a determinados horários no
chamado “Centro Expandido”. Com base no digito final da placa, o motorista sabe se deve
ou não circular no horário proibido.
Faça um algoritmo que receba o digito final da
placa de um automóvel e imprima qual o dia
da semana o veículo não pode circular no
“Centro Expandido”. Utilize um método que
recebe o digito da placa e retorne o dia da
semana 
*/
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int dig;

        dig = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ultimo dígito da placa do seu veículo", "Digite aqui!"));

        switch(dig) {
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "Rodízio na segunda-feira no Centro Expandido", "Atenção", 2);
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Rodízio na terça-feira no Centro Expandido", "Atenção", 2);
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "Rodízio na quarta-feira no Centro Expandido", "Atenção!", 2);
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "Rodízio na quinta-feira no Centro Expandido", "Atenção!", 2);
                break;
            case 9:
            case 0:
                JOptionPane.showMessageDialog(null, "Rodízio na sexta-feira no Centro Expandido", "Atenção!", 2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digito inválido", "Atenção", 2);
        }
    }
}
