package desviosCondicionais;
import java.util.Scanner;

public class dePara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ini, f, cont;

        System.out.println("Digite 2 numeros: ");
        ini = input.nextInt();
        f  = input.nextInt();
        for(cont = ini; cont <= f; cont++){
            System.out.println(cont);
        }
    }
}
