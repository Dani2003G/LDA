/*
Escreva um programa em Java que solicite ao usuário a distância entre duas cidades e o tempo de viagem. 
O programa deverá calcular e exibir a velocidade média de um carro que vai de uma cidade para outra. 
Utilize a fórmula:
Um = distancia / tempo
*/

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double distancia, tempo;
        int velocidade;

        distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a distancia entre as duas cidades (Km/h):"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a o tempo gasto nesta viagem (Horas):"));

        velocidade = (int) (distancia / tempo);

        JOptionPane.showMessageDialog(null, String.format("A velocidade média do carro é: %d Km/h", velocidade));

    }
}
