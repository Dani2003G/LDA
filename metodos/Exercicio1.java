/* 
Faça um método que receba como parâmetros o Km inicial, Km final, quantidade de
litros gastos e preço do litro. Calcule e mostre:
- Distância percorrida;
- Consumo médio;
- Valor gasto;
Faça um algoritmo principal que solicite para o usuário o valor da quilometragem inicial,
final, a quantidade de litros gastos e o preço do litro e mostre a distância percorrida, o
consumo médio e o valor gasto, para isso utilize o método definido acima.
*/
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        double kmInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a kilometragem inicial: "));
        double kmFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a kilometragem final: "));
        double litroGastos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de litros gastos: "));
        double precoLitro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade do preço do litro: "));
    
        double distancia = distancia(kmInicial, kmFinal);
        double consumo = consumo(distancia, litroGastos);
        double valorGasto = valorGasto(consumo, precoLitro);

        JOptionPane.showMessageDialog(null, String.format("Distancia pecorrida = %.2f \n"
                                                        +"Consumo médio = %.2f \n"
                                                        + "Valor gasto = %.2f", distancia, consumo, valorGasto));
    }

    public static double distancia(double kmInicial, double kmFinal) {
        return kmFinal - kmInicial;
    }

    public static double consumo(double distancia, double litroGastos) {
        return distancia / litroGastos;
    }

    public static double valorGasto(double consumo, double precoLitro) { 
        return consumo * precoLitro;
    }

}