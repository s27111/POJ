import java.sql.SQLOutput;
import java.util.Scanner;

public class zad4 {
    public void run() {
        System.out.println("\nZadanie 4\n" +
                "Napisz program, który dla trzech boków a,b,c\n" +
                " podanych wcześniej przez użytkownika stwierdzi\n" +
                " czy da się z tych boków zbudować trójkąt.\n" +
                " Trójkąt da się zbudować z boków a,b,c wtedy i tylko wtedy\n" +
                " gdy zachodzą następujące warunki:\n");
        Scanner scanner = new Scanner(System.in);
        int bokA, bokB, bokC;
        System.out.println("Podaj trzy wymiary a b c ");
        System.out.print("bok a= ");
        bokA = scanner.nextInt();
        System.out.print("bok b= ");
        bokB = scanner.nextInt();
        System.out.print("bok c= ");
        bokC = scanner.nextInt();

        if ( ((bokA + bokB) >bokC) && ((bokA + bokC) > bokB) && ((bokB + bokC) > bokA)) {
            System.out.println("TAK");
        } else if (bokA <=0 || bokB <=0 || bokC <= 0) {
            System.out.println("blad");
        }
        else {
            System.out.println("nie");
        }
    }

}
