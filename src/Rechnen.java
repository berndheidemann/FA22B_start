public class Rechnen {

    public static void main(String[] args) {

        int i = 5;
        i = i + 87;
        System.out.println(i);

        int i2 = 5;
        i2 += 87;
        System.out.println(i);

        int i3 = 0;
        i3++;   // i3+=1 bzw. i3=i3+1
        System.out.println(i3);
        i3--;   // i3-=1 bzw. i3=i3-1
        System.out.println(i3);


        System.out.println("i4");
        int i4 = 0;
        System.out.println(i4);
        System.out.println(i4++);
        System.out.println(i4);

        System.out.println("i5");
        int i5 = 0;
        System.out.println(i5);
        System.out.println(++i5);
        System.out.println(i5);

        // + - * / %

        System.out.println("modulo: " + 123 % 100);


        // Rundungsfehler bei Fließkommazahlen

        double d = 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);

    }


}
