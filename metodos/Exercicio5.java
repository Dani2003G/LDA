/*
Elabore um algoritmo para calcular a velocidade de três objetos diferentes (com
velocidade constante). Conhecemos (são dados digitados pelo usuário), para cada
objeto, a distância percorrida e o tempo que necessitou para percorrer essa distância.
Utilize um método geral que calcule e retorne a velocidade de um objeto, fornecidos
como parâmetros os dados de distância e tempo.
*/
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double distancia, tempo;

        distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a distância em km: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tempo gasto na viagem em h: "));
    
        JOptionPane.showMessageDialog(null, String.format("A velocidade do obj 1 é de: %.0f Km \n"
                                                        + "A velocidade do obj 2 é de: %.0f Km \n"
                                                        + "A velocidade do obj 3 é de: %.0f Km"
                                                        , velocidade(distancia, tempo), velocidade(100, 5), velocidade(200, 10)));
    }

    public static double velocidade(double distancia, double tempo) {
        return distancia / tempo;
    }
}
