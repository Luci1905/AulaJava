package EstruturasDecicao;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double valor1 = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o segundo valor: ");
        double valor2 = Double.parseDouble(leitor.nextLine());

        if (valor1 > valor2) {
            System.out.print(valor1);
        } else if (valor2 > valor1) {
            System.out.print(valor2);
        }else {
            System.out.print("Os numeros são iguais");
        }
    }
}
