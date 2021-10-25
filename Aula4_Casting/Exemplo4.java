/* 
Faça um programa que leia quatro números reais correspondentes às coordenadas x e
y de dois pontos no plano cartesiano, p1(x1, y1) e p2(x2, y2), calcule e mostre a distância
entre eles, com quatro casas decimais, segundo a fórmula:
𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎 = raiz( (𝑥1 − 𝑥2)² + (𝑦1 − 𝑦2)²)
Entrada: Contém quatro números reais.
Saída: Imprimir a distância entre os pontos, com quatro casas decimais:
*/
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do x1: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o valor do y1: ");
        y1 = sc.nextDouble();
        System.out.print("Digite o valor do x2: ");
        x2 = sc.nextDouble();
        System.out.print("Digite o valor do y2: ");
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("Entrada p1(%.2f, %.2f) e p2(%.2f, %.2f) \n Saida: \n"
                          + "A distancia entre os pontos é %.4f", x1, y1, x2, y2, distancia);
        sc.close();
    }
}