import java.util.Scanner;

public class Eingaben {

    public static void main(String[] args) {

        String eingabe;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein: ");
        eingabe = scan.nextLine();

        if (eingabe.equals("Hallo")) {
            System.out.println("Hallo zurück");
        } else {
            System.out.println("Sag doch mal Hallo");
        }

        System.out.println("Geben Sie eine Zahl ein:");
        int i = scan.nextInt();
        System.out.println(i);
    }
}
