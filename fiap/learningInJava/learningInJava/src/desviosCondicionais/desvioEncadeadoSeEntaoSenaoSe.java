package desviosCondicionais;

import java.util.Scanner;

public class desvioEncadeadov2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sal, ir, sal_liq;

        System.out.print("Digite o salario: ");
        sal = input.nextDouble();
                if (sal <= 1900){

            ir = 0;
        }
        else {
            if (sal <=2800){
                ir = sal * 0.15;
            }
            else {
                ir = sal * 0.275;
            }
        }
        sal_liq = sal - ir;
        System.out.println("IR: " + ir);
        System.out.println("Salario Liquido: " + sal_liq);
    }
}
