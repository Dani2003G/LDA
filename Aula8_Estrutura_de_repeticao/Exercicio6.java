/* 
Escreva um algoritmo que leia um grupo de valores reais e determine quantos valores
são positivos e quantos são negativos. Determine, também, qual é o menor desses
valores. Utilize o comando de repetição que desejar
*/
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double num, menor;
        int pos, neg, i, n;

        Scanner sc = new Scanner(System.in);

        pos = 0;
        neg = 0;

        System.out.print("Quantos valores serão processados? ");
        n = sc.nextInt();
        System.out.print("Digite um valor: ");
        menor = sc.nextDouble();

        if(menor >= 0)
            pos += 1;
        if(menor < 0)
            neg += 1;

        for(i = 1; i < n; i++) {
            System.out.print("Digite um valor: ");
            num = sc.nextDouble();
            if(menor >= 0)
            pos += 1;
            if(menor < 0)
                neg += 1;
            if(num < menor)
                menor = num;
        }
        
        System.out.printf("A quantidade de números positivos é %d e de negativos é %d, e o menor número é %.2f", pos, neg, menor);
        sc.close();
    }
}