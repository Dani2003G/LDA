/* 
Faça um algoritmo que receba o código correspondente ao cargo de um funcionário e
seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos
estão na tabela a seguir, utilize a estrutura escolha...caso
*/
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int cod;
        double salario, aumento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código referente ao seu cargo atual \n"
                        + "1 - Escriturário \n2 - Secretário \n3 - Caixa \n"
                        + "4 - Gerente \n5 - Diretor");
        cod = sc.nextInt();
        System.out.print("Digite o seu salário atual: ");
        salario = sc.nextDouble();

        switch(cod) {
            case 1:
                aumento = salario * 0.5;
                salario = salario + aumento;
                System.out.printf("Seu cargo atual é Escriturário, você teve um aumento de: %.2f R$ e seu novo salário é de: %.2f R$", aumento, salario);
                break;
            case 2:
                aumento = salario * 0.35;
                salario = salario + aumento;
                System.out.printf("Seu cargo atual é Secretário, você teve um aumento de: %.2f R$ e seu novo salário é de: %.2f R$", aumento, salario);
                break;
            case 3:
                aumento = salario * 0.2;
                salario = salario + aumento;
                System.out.printf("Seu cargo atual é Caixa, você teve um aumento de: %.2f R$ e seu novo salário é de: %.2f R$", aumento, salario);
                break;
            case 4:
                aumento = salario * 0.1;
                salario = salario + aumento;
                System.out.printf("Seu cargo atual é Gerente, você teve um aumento de: %.2f R$ e seu novo salário é de: %.2f R$", aumento, salario);
                break;
            case 5:
                System.out.printf("Seu cargo atual é Diretor, você não teve aumento então seu salário continua o mesmo: %.2f R$", salario);
                break;
            default:
                System.out.println("Código inválido");
        }

        sc.close();
    }
}