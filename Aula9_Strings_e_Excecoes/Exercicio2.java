/* 
Faça um programa em Java para criptografar uma frase dada pelo usuário, ou seja, a
criptografia deverá inverter a frase. Exemplo:
▪ Frase: EU ESTOU NA ESCOLA
▪ Saída: ALOCSE AN UOTSE UE
Solução:
■ Digitar uma frase.
■ Pegar o tamanho da frase digitada.
■ Percorrer a frase do último caractere ao primeiro, copiando-o para a nova cadeia
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String frase;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        sc.close();

        for(i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
