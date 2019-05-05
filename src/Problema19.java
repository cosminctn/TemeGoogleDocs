import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int aux =0;
        long cnpIntors=0;
        System.out.println(" se da un numar care reprezeinta CNP-ul unei persoane si are urmatorul format => SAALLZZJJNNNC. sa se scrie un program care afiseaza sexul, luna si anul nasterii ");
        long cnp = reader.nextLong();

        int lungime = Long.toString(cnp).length();
        for (int i = 0; i <lungime; i++) {
            cnpIntors = (cnpIntors*10) + (cnp % 10);
            cnp = cnp / 10;
        }

        System.out.println(cnpIntors);
        for (int i = 0; i < lungime; i++) {
            if (((cnpIntors%10)==1)|| ((cnpIntors%10)==3)||  ((cnpIntors%10)==5)||((cnpIntors%10)==7)  ){
                System.out.println("baiat");
            }else if (((cnpIntors%10)==2)|| ((cnpIntors%10)==4)||  ((cnpIntors%10)==6)||((cnpIntors%10)==8)  ){
                System.out.println("fata");
            }
            cnpIntors = cnpIntors /10;
            for (int j = 0; j < 1; j++) {
                aux = (int) ((aux*10) + (cnpIntors % 10));
            }

        }

    }
}
