/*
- Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de
idade, sexo (M/F) e salário. Faça um algoritmo que informe:
a) a média de idade do grupo;
b) a média de salários dos homens;
c) quantidade de mulheres com salário abaixo de R$600,00.
Encerre a entrada de dados quando for digitada uma idade negativa (os dados da idade
negativa não podem entrar nos cálculos dos itens solicitados acima).
*/
import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        int idade, mulheres, homens, i;
        double salario, mediaIdade, mediaSalario;
        char sexo;

        mulheres = 0;
        homens = 0;
        idade = 0;
        mediaIdade = 0;
        mediaSalario = 0;
        i = 0;

        while(idade >= 0) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da pessoa: (idade negativa para sair) "));
            if(idade >= 0) {
                i++;
                mediaIdade += idade;
                sexo = JOptionPane.showInputDialog(null, "Digite o sexo da pessoa: M/F ").toLowerCase().charAt(0);
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario da pessoa: "));
                if(sexo == 'm') {
                    mediaSalario += salario;
                    homens += 1;
                }
                if(sexo == 'f' && salario < 600) {
                    mulheres += 1;
                }
            }
        }

        mediaIdade /= i;
        mediaSalario /= homens;

        JOptionPane.showMessageDialog(null, String.format("A média da idade do grupo é %.2f \nA média do salário dos homens é %.2f \nA quantidade de mulheres com salário abaixo de 600 R$ é de %d mulher(es)", mediaIdade, mediaSalario, mulheres));
    }
}
