public class IfAnweisungen {

    public static void main(String[] args) {

        int i = 5;
        if (i < 5) {
            System.out.println("kleiner 5");
        } else if (i == 5) {
            System.out.println("gleich 5");
        } else {
            System.out.println("größer 5");
        }

        char c = 'a';
        if (c == 'a') {
            System.out.println("ist a");
        }

        boolean b = true;
        if (b) {
            System.out.println("true");
        }


        String s = "Hallo";
        if (s.equals("Hallo")) {
            System.out.println("Hallo ist korrekt");
        }


    }
}
