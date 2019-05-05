import java.util.Scanner;

public class Problema13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("13. se da un numar n. scrieti un program care va afisa de n ori mesajul \"go\", urmat de gata.");
        int nNumarNatural = reader.nextInt();
        for (int i = 0; i < nNumarNatural; i++) {
            System.out.println(i+1 + ": go");
        }
        System.out.println("gata");
    }
}
