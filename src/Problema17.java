import java.util.Scanner;

public class Problema17 {
    public static void main(String[] args) {
        int aux = 0;
        int numarIntors = 0;
        int sumaPare =0;
        int sumaImpare = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("se da un numar n. sa se calculeze m unde m este suma cifrelor de pe pozitiile pare - suma cifrelor de pe pozitiile impare\n");
        int nNumarNatural = reader.nextInt();
        int lungime = Integer.toString(nNumarNatural).length();

        for (int i = 0; i <lungime; i++) {
            numarIntors = (numarIntors*10) + (nNumarNatural % 10);
            nNumarNatural = nNumarNatural / 10;
        }


        System.out.println(numarIntors);

        while (numarIntors!=0){
            if ((aux % 2)==0){
                sumaPare=sumaPare +(numarIntors%10);
            }else {
                sumaImpare = sumaImpare + (numarIntors%10);
            }
            aux = aux + 1;
            numarIntors = numarIntors / 10;
        }
       int m = sumaPare - sumaImpare;
        System.out.println(m);
    }
}
