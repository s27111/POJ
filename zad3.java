import java.util.Scanner;
public class zad3 {

    public void run(){
        System.out.println("napisz dwa wyrazy po spacji");
        Scanner scanner = new Scanner(System.in);
        var tekst = scanner.nextLine();
        System.out.println(proces(tekst));
    }
    public String proces(String tekst){
        var elementy = tekst.split(" ");
       return elementy[1] + "\s" + elementy[0];
    }
}
