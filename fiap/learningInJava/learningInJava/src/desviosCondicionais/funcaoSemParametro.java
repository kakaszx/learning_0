public class funcaoSemParametro {
    public static double pi() {
        return 3.14;
    }
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a, r = 5;
    a = funcaoSemParametro.pi() * (r * r);
    System.out.println("A área do círculo com raio " + r + " é " + a);
}