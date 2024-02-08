import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        double alan,cevre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("yaricap giriniz");

        r = scanner.nextInt();

        alan = pi * r* r;
        System.out.println("alan: " + alan);

        cevre = 2*pi*r;
        System.out.println("cevre: " + cevre) ;


    }
}