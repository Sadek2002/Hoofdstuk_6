import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van welk getal wil je de weekdag weten?");
        int dagnummer = scanner.nextInt();
        String uitkomst = bepaalDag(dagnummer);
        System.out.println("Bij nummer " + dagnummer + " hoort de weekdag " + uitkomst + ".");
    }

    public static String bepaalDag(int dagnummer) {
        if (dagnummer == 1) {
            return "maandag";
        } else if (dagnummer == 2) {
            return "dinsdag";
        } else if (dagnummer == 3) {
            return "woensdag";
        } else if (dagnummer == 4) {
            return "donderdag";
        } else if (dagnummer == 5) {
            return "vrijdag";
        } else if (dagnummer == 6) {
            return "zaterdag";
        } else if (dagnummer == 7) {
            return "zondag";
        }
        return "onbekent";
    }
}


