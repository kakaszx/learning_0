package desviosCondicionais;

import java.util.Scanner;

public class desvioSimples {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o valor da venda: ");
    double venda, desconto;

    venda = input.nextDouble();
    if (venda > 300);

        {
            desconto = venda * 10 / 100;
                    venda = venda - desconto;

        }
        System.out.printf("Venda: R$ %.2f\n", venda);
    }
}
