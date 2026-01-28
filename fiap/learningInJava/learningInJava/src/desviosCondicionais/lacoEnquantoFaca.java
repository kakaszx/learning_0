package desviosCondicionais;

import java.util.Scanner;

public class lacoEnquantoFaca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao;

        System.out.println("Digite [S]im ou [N]ão: ");
        opcao = input.next();

        while (!(opcao.equals("s") || opcao.equals("S") || opcao.equals("N") || opcao.equals("n"))){
            System.out.println("Você digitou " + opcao + " digite S ou N!");

            System.out.println("Digite [S]im ou [N]ão: ");
            opcao = input.next();
        }
        System.out.println("Você digitou " + opcao);
    }
}
