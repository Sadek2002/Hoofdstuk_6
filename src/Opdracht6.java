import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van welk getal wil je weten of het een even getal is?");
        int getal = scanner.nextInt();
        Boolean isEven = isEvenGetal(getal);
        if (isEven) {
            System.out.println("Het getal " + getal + " is een even getal");
    }   else {
            System.out.println("Het getal " + getal + " is geen even getal");
        }
        }

    public static boolean isEvenGetal(int getal) {
        if (getal % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
