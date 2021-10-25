/*
Faça um algoritmo que calcule e exiba a tabuada (0 ao 10) para os números de 0 a
10. Exibir no formato “tab x i = y”
*/

public class Exercicio10 {
    public static void main(String[] args) {
        int i, n, soma;

        for(i = 0; i <= 10; i++) {
            for(n =0; n <=10; n++) {
                soma = i * n;
                System.out.printf("%d X %d = %d\n", i, n, soma);
            }
            System.out.println("--------------------------------------------");
        }
    }
}
