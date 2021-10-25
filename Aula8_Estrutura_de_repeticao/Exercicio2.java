/* 
Faça um algoritmo que imprima os números de 1 a 50 de 1 em 1 e de 52 a 100 de 2
em 2.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        int i;

        for(i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        for(i = 52; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
