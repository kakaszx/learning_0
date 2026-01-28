package desviosCondicionais;

import java.util.Scanner;

public class maior3Numeros {

        public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in);

            int n1, n2, n3, maior;
            System.out.println("Digite 3 números:");
            n1 = entrada.nextInt();
            n2 = entrada.nextInt();
            n3 = entrada.nextInt();

            maior = n1;

            if (n2 > maior)
                maior = n2;
            if (n3 > maior)
                maior = n3;

            System.out.println("Maior número: maior");
        }
    }

