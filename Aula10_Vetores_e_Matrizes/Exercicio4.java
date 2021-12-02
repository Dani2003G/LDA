import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String nome[] = new String[10];
        double salario[][] = new double[10][6];
        double media;
        int i, j;

        Scanner sc = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.printf("Digite o nome do %d° funcionário: ", (i + 1));
            nome[i] = sc.nextLine();
            media = 0;
            for(j = 0; j < 6; j++){
                System.out.printf("Agora precisamos saber o salário do funcionário %s nos ultimos 6 mesês", nome[i]);
                System.out.println();
                System.out.printf("Digite o salário %d/6: ", (j + 1));
                salario[i][j] = sc.nextDouble();
                sc.nextLine();
                media += salario[i][j];
            }
            media /= 6;

            System.out.printf("A média salárial do(a) funcionário %s nos últimos 6 mesês é %.2f", nome[i], media);
            System.out.println();
        }
    }
}
