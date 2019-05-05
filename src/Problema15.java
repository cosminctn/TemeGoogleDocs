import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int aux=0;
        System.out.println("se dau doua numere n si m, scrieti un program care afiseaza \"true\" sau \"false\" (daca n este inversul lui m). exemplu: n = 12, m = 21 => true; n = 10, m = 1 => false\n");
        System.out.println("primul numar: ");
        int nNumarNatural = reader.nextInt();
        System.out.println("al doilea numar: ");
        int mNumarNatural = reader.nextInt();

        while (nNumarNatural!=0){
            aux = aux + (nNumarNatural % 10);
            nNumarNatural = nNumarNatural / 10;
            if ((nNumarNatural % 10)!=0){
                aux = aux * 10;
            }

        }
        if (mNumarNatural == aux){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
