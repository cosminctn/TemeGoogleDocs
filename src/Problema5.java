import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("se da un numar natural n. afisati in ordine descrescatoare, primele n numere naturale nenule.");
        int nNumarNatural = reader.nextInt();
        while (nNumarNatural != 0){
            System.out.println(nNumarNatural);
            nNumarNatural = nNumarNatural -1;
        }

    }
}
