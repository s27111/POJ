import java.util.Scanner;

public class zad1 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        double bokA,bokB;

        System.out.println("\nZadanie 1\n" +
                "Napisz program, który obliczy pole prostokąta o bokach a i b,\n" +
                " wprowadzonych wcześniej przez użytkownika (każda wartość będzie\n" +
                " znajdować się w osobnej linii).\n");

        System.out.print("Podaj A: ");
        bokA = scanner.nextDouble();

        System.out.print("Podaj B: ");
        bokB = scanner.nextDouble();

        System.out.print("Wynik= ");
        System.out.println(liczPole(bokA, bokB));

    }
    public double liczPole(double A, double B) {
        return A * B;
    }
}
