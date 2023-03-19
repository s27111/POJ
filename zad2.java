public class zad2 {
    public void run() {
        System.out.println("\nZadanie 2\n" +
                "Napisz program, który wyświetla na ekranie komputera\n" +
                " pierwiastek kwadratowy z wartości liczby pi z dokładnością\n" +
                " do dwóch miejsc po przecinku.\n");
        double liczbaPi = Math.PI;
        double sqrt = Math.sqrt(liczbaPi);
        System.out.format("%.2f%n\n",sqrt);
        // %-konwersja znaku, .2f dwa miejsca po przecinku float, %n nowa linia
    }
}
