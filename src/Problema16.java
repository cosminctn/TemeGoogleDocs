import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        int aux = 0;
        int numarIntors = 0;
        int suma =0;
        Scanner reader = new Scanner(System.in);
        System.out.println("sa da un numar n. sa se calculeze suma cifrelor de pe pozitiile pare ale numarului. ex : n = 1234, suma => 1 + 3 = 4");
        int nNumarNatural = reader.nextInt();
        int lungime = Integer.toString(nNumarNatural).length();

        for (int i = 0; i <lungime; i++) {
            numarIntors = (numarIntors*10) + (nNumarNatural % 10);
            nNumarNatural = nNumarNatural / 10;
        }

        System.out.println(numarIntors);

        while (numarIntors!=0){
            if ((aux % 2)==0){
                suma=suma +(numarIntors%10);
            }
            aux = aux + 1;
            numarIntors = numarIntors / 10;
        }
        System.out.println(suma);
    }
}
