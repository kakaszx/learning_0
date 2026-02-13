package desviosCondicionais;

import java.util.Scanner;

public class procedimentosComParametro {
    public static void saudacao(int hora) {
        String msg;

        if (hora < 12)
            msg = "Bom dia";
        else if (hora < 18)
            msg = "Boa tarde";
        else
            msg = "Boa noite";
        System.out.println(msg + ", Seja bem-vindo");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        saudacao(15);
    }
}