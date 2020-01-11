import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal1;
        int getal2;
        System.out.println("We gaan twee getallen vermenigvuldigen.");
        System.out.println("Wat is het eerste getal?");
        getal1 = scanner.nextInt();
        System.out.println("Wat is het tweede getal?");
        getal2 = scanner.nextInt();
        int product = berekenen(getal1, getal2);
        System.out.println("Het product van " + getal1 +  " en " +  getal2 + " is " + product + ".");
    }

    public static int berekenen(int getal1, int getal2) {
        return getal1 * getal2;
    }
}

