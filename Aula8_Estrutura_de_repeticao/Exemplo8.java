import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        double nota, media, soma = 0;
        char res = 's';
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        while(res == 's') {
            do {
                System.out.print("Digite a nota do aluno: ");
                nota = sc.nextDouble();

                if(nota < 0 || nota > 10) {
                    System.out.println("A nota digitada é inválida!!");
                }
            } while(nota < 0 || nota > 10);

            soma += nota;
            cont++;

            System.out.print("Deseja continuar? S/N: ");
            res = sc.next().toLowerCase().charAt(0);
        }

        media = soma / cont;

        System.out.printf("A média da turma é: %.2f", media);
        
        sc.close();
    }
}
