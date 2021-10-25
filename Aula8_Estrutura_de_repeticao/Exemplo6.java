import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        int i = 0;
        char res = 's';
        double nota, soma = 0, media;

        Scanner sc = new Scanner(System.in);

        while(res == 's') {
            System.out.print("Digite a nota do aluno: ");
            nota = sc.nextDouble();

            soma += nota;

            i += 1;

            System.out.print("Deseja continuar? S/N: ");
            res = sc.next().toLowerCase().charAt(0);
        }

        media =  soma / i;

        System.out.printf("A média da turma foi %.2f", media);

        sc.close();
    }   
}
