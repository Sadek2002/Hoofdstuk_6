import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Welk zinnetje moet ik printen?");
        userInput = scanner.nextLine();
        printZinnetje(userInput);
    }
    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje);
    }
}
