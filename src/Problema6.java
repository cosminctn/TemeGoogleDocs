import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        int count =0;
        int numar =0;
        Scanner reader = new Scanner(System.in);
        System.out.println("se da un numar natural n. afisati in ordine crescatoare, primele n numere naturale impare");
        int nNumarNatural = reader.nextInt();
        while(count != nNumarNatural) {
            numar=numar+1;
            if ((numar%2)!=0){
                System.out.println(numar);
                count = count +1;
            }

        }

    }
}
