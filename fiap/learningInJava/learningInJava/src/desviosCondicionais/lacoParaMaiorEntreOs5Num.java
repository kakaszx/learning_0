package desviosCondicionais;

import java.util.Scanner;

public class lacoParaMaiorEntreOs5Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, cont, maior;

        System.out.println("Digite 5 numeros: ");
        num = input.nextInt();
        maior = num;

        for (cont = 1; cont <= 4; cont++) {
            num = input.nextInt();
            if (num > maior) {
                maior = num;
            }

        }
        System.out.println("Maior valor = " + maior);

    }
}
