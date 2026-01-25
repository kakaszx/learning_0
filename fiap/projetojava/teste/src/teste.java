import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, dobro;

    System.out.print("Digite um numero: ");
    num = input.nextInt();
    dobro = num + num;
    System.out.print("Dobro = " + dobro);
    }
}
