import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int sumaPare=0;
        while (i<5){
            int sirNumereNaturale = reader.nextInt();
            if ((sirNumereNaturale % 2)==0){
                sumaPare = sumaPare + sirNumereNaturale;
                i=i+1;
            }
        }
        System.out.println(sumaPare);

    }
}
