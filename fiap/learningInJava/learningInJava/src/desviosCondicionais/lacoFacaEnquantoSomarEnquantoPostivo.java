package desviosCondicionais;

import java.util.Scanner;

public class lacoFacaEnquantoSomarEnquantoPostivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, soma = 0;
        do {
            System.out.print("Digite um numero: ");
            num = input.nextInt();
            if (num > 0) {
                soma = soma + num;
            }
        } while (num >= 0);
        System.out.println("Soma: " + soma);
    }
}
