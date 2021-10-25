import java.util.Scanner;

/*
Elabore um programa em Java que leia a placa de um veículo no formato LL-NNNN e
exiba o dia do rodízio desse veículo. O programa deverá possibilitar a consulta de mais de
uma placa, a critério do usuário e fazer o tratamento de exceção.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        String placa;
        char res = 's';
        int ultimo;

        Scanner sc = new Scanner(System.in);

        while(res == 's'){
            System.out.print("Digite a placa do veiculo, padrão (LL-NNNN): ");
            placa = sc.nextLine();

            if(placa.length() == 7) {
                ultimo = Integer.parseInt(placa.substring(placa.length() -1));

                switch(ultimo){
                    case 1:
                    case 2:
                        System.out.println("Rodízio na segunda-feira no Centro Expandido");
                        break;
                    case 3:
                    case 4:
                        System.out.println("Rodízio na terça-feira no Centro Expandido");
                        break;
                    case 5:
                    case 6:
                        System.out.println("Rodízio na quarta-feira no Centro Expandido");
                        break;
                    case 7:
                    case 8:
                        System.out.println("Rodízio na quinta-feira no Centro Expandido");
                        break;
                    case 9:
                    case 0:
                        System.out.println("Rodízio na sexta-feira no Centro Expandido");
                        break;
                }
            } else {
                System.out.println("Placa inválida");
            }

            System.out.print("Deseja continuar? S/N: ");
            res = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
        }
        sc.close();
    }
}
