import java.util.Scanner;

public class Problema14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("scrieti o bucla infinita care va afisa de n ori \"going\".");
        int nNumarNatural = reader.nextInt();
        int i = 1;
        while(true){
            System.out.println("going");
            if (i == nNumarNatural){
                break;
            }
            i = i+1;
        }
    }
}
