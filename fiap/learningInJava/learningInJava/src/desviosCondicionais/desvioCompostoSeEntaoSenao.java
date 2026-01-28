package desviosCondicionais;

import java.util.Scanner;

public class desvioCompostoSeEntaoSenao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc;
        double sal,novo_sal,aumento;

        System.out.print("Digite o tempo de casa ");
        tc = input.nextInt();
        System.out.print("Digite o seu salario ");
        sal = input.nextDouble();
        if (tc < 3){
            aumento = sal * 0.05;
        }
else{
    aumento = sal * 0.1;
        }
novo_sal = sal + aumento;

System.out.print("O seu salario foi de " + sal + " para " + novo_sal);
    }
}
