import java.util.Scanner;

public class problema4 {
    public static void main(String[] args) {
        int numerePare=0;
        int numereImpare=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("se dau n numere naturale. sa se calculeze cate dintre ele sunt pare si cate impare. Cate numere?");
        int nNumereNaturale = reader.nextInt();
        int [] numereNaturale = new int [nNumereNaturale];
        for (int i = 0; i < nNumereNaturale; i++) {
            System.out.println("numarul " + (i + 1) + ": ");
            numereNaturale[i] = reader.nextInt();
            if ((numereNaturale[i] % 2) == 0){
                numerePare=numerePare+1;}
            else{
                numereImpare=numereImpare+1;
            }
        }
        System.out.println("Numere Pare: " + numerePare);
        System.out.println("Numere Impare: " + numereImpare);
    }
}
