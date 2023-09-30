package EstruturasRepeticao;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        do {
            System.out.println("Digite sua idade: ");
            idade = leitor.nextInt();

            if (idade < 18){
                System.out.println("Idade invalida!");
            }

        }while (idade < 18);
        System.out.println("Maior que 18 anos");
    }
}
