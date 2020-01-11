import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal1 = (int) (Math.random() * 10 + 1);
        int getal2 = (int) (Math.random() * 10 + 1);
        int product = berekenProduct(getal1, getal2);
        System.out.println("Het product van " + getal1 +  " en " +  getal2 + " is " + product + ".");
    }
    public static int berekenProduct(int getal1, int getal2) {
        return getal1 * getal2;
    }
}
