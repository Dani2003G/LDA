/*
Elaborar um algoritmo que leia um conjunto de valores reais, correspondentes a 80
notas dos alunos de uma turma, notas estas que variam de 0 a 10. Calcule e mostre:
a) A quantidade de alunos aprovados (nota >= 6.0)
b) a média das notas da turma
*/
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double nota, media;
        int i, aprovado;

        Scanner sc = new Scanner(System.in);

        media = 0;
        aprovado = 0;

        for(i = 0; i < 80; i++) {
            do {
                System.out.print("Digite a nota do aluno: ");
                nota = sc.nextDouble();
                if(nota < 0 || nota > 10)
                    System.out.println("A nota digitada é inválida!!");
            } while(nota < 0 || nota > 10);
            media += nota;
            if(nota >= 6) {
                aprovado += 1;
            }
        }

        media /= 80;

        System.out.printf("A quantidade de alunos aprovados é %d, e a média da turma é %.2f", aprovado, media);
        sc.close();
    }
}
