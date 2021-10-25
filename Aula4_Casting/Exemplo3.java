/* 
- Faça um programa que leia o nome de um vendedor, seu salário fixo e o total de
vendas efetuadas no mês (em reais). Sabendo que o vendedor recebe 5% de comissão
sobre as vendas efetuadas, o programa deve calcular e exibir o total a receber no final do
mês, com duas casas decimais.
Entrada: Contém um texto para o primeiro nome do vendedor e dois reais para salário
fixo e total de vendas.
Saída: Imprimir o nome do funcionário, seguido pelo salário
*/
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        String nome;
        double salario, vendas;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o salário base do funcionário " + nome + ": ");
        salario = sc.nextDouble();
        System.out.print("Digite o valor das venda do funcionário " + nome + ": ");
        vendas = sc.nextDouble();
        
        salario = salario + vendas * 0.05;

        System.out.printf("O funcionário %s deve receber %.2f reais", nome, salario);
        sc.close();
    }
}