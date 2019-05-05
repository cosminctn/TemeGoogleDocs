import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {

        String[] mesaj = {"zero", "unu", "doi", "trei", "patru","cinci", "sase", "sapte", "opt", "noua"};
        Scanner reader = new Scanner(System.in);
        System.out.println(" sa da un numar 0 <= n <= 9 (intre 0 si 9). afisati un mesaj spunand ce numar reprezinta (zero, unu, etc) sau \"numar gresit\" pentru cazul cand n este in afara intervalului.\n" +
                "pentru problema 11, trebuie sa scrieti 2 variante ale programului. una folosind if-esle, una folosind switch.");
        int nNumarNatural = reader.nextInt();
        //metoda 1
        if ((nNumarNatural>9)||(nNumarNatural<0)){
            System.out.println("Numar in afara intervalului");
        }
        else{
            System.out.println(mesaj[nNumarNatural]);
        }

        //metoda 2
        switch (nNumarNatural) {
            case 1:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 2:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 3:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 4:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 5:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 6:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 7:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 8:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 9:
                System.out.println(mesaj[nNumarNatural]);
                break;
            case 0:
                System.out.println(mesaj[nNumarNatural]);
                break;
            default:
                System.out.println("numar gresit");
                break;
        }
    }
}
