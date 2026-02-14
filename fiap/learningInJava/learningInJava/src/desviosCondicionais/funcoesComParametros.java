package desviosCondicionais;

import java.util.Scanner;

public class funcoesComParametros {
    public static boolean nota_valida(double nota) {
        if (nota >= 0 && nota <= 10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a nota 1: ");
        nota1 = input.nextDouble();

        if (nota_valida(nota1)) {
            System.out.println("Digite a nota 2: ");
            nota2 = input.nextDouble();
            if (nota_valida(nota2)) {
                media = (nota1 + nota2) / 2;
                System.out.println("A media das nota " + nota1 + " + " + nota2 + " = " + media);
            } else {
                System.out.println("A nota 2 => '" + nota2 + "' é inválida");
            }
        } else {
            System.out.println("A nota 1 => '" + nota1 + "' é inválida");
        }


    }
}
