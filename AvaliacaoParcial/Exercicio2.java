/* 
A escola “APRENDER” faz o pagamento de seus professores por hora de acordo com a categoria. Faça
um programa em Java que obtenha a categoria do professor e a quantidade de horas semanais por ele trabalhadas e utilizando
estrutura de decisão if encadeada ou estrutura switch...case, calcule e mostre o salário de professor. Sabe-se que o valor da
hora segue a tabela abaixo e que para o cálculo do salário mensal são consideradas 4,5 semanas:
Caso seja digitada uma categoria diferente das apresentadas na tabela mostre a mensagem “Categoria inexistente”.
Obs.: Utilize a entrada no modo gráfico (classe JOptionPane) e a saída no terminal (System.out). 
*/
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int horas, categoria;
        double salario = 0;

        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas por semana: "));
        do{
            categoria =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua categoria de professor: "));
            if(categoria < 1 || categoria > 3)
                JOptionPane.showMessageDialog(null, "Categoria inexistente");
        } while(categoria < 1 || categoria > 3);

        switch(categoria){
            case 1:
                salario = horas * 12 * 4.5;
                break;
            case 2:
                salario = horas * 17 * 4.5;
                break;
            case 3:
                salario = horas * 25 * 4.5;
                break;
        }

        System.out.printf("Seu salário é %.2f", salario);
    }
}
// RGM: 25496581