import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        int sumaCifre =0;
        Scanner reader = new Scanner(System.in);
        System.out.println("se da un numar natural n. afisati suma cifrelor numarului 2 * 3 ^ n (2 inmultit cu 3 la puterea n)");
        int nNumarNatural = reader.nextInt();
        int ecuatie = (int) (2*Math.pow(3,nNumarNatural));
        System.out.println(ecuatie);
        while (ecuatie!=0){
            sumaCifre = sumaCifre + (ecuatie % 10);
            ecuatie = ecuatie / 10;
            System.out.println(sumaCifre);
        }
    }
}

