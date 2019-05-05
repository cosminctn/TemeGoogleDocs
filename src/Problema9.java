import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("se da un numar natural n.");
        int nNumarNatural = reader.nextInt();
        int i=0;
        while (i != nNumarNatural){
            for (int j = 0; j <= i ; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
            i=i+1;
        }
    }
}
