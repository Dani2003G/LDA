/* 
Faça um algoritmo que solicite um código referente ao tipo da diária de hospedagem e
também a quantidade de diárias desejada por um cliente. Calcule e mostre, usando
estrutura condicional aninhada, o valor total a pagar pelo cliente
*/
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int cod, dias; 
        double preco;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo da sua hospedagem \n1 - Simples \n2 - Duplo \n3- Triplo");
        cod = sc.nextInt();
        System.out.print("Digite quantos dias você ficará no hotel: ");
        dias = sc.nextInt();

        if(cod == 1) {
            preco = dias * 255.5;
            System.out.printf("Você terá que pagar %.2f R$ para ficar aqui por %d dia(s)", preco, dias);
        }
        else if(cod == 2) {
            preco = dias * 305.5;
            System.out.printf("Você terá que pagar %.2f R$ para ficar aqui por %d dia(s)", preco, dias);
        }
        else if(cod == 3) {
            preco = dias * 360.5;
            System.out.printf("Você terá que pagar %.2f R$ para ficar aqui por %d dia(s)", preco, dias);
        } 
        else {
            System.out.println("“Tipo de diária inválido");
        }

        sc.close();
    }
}
