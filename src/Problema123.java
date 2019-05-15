import java.util.Scanner;
public class Problema123 {

    public static void main(String[] args){
        int i =0;

        //Problema 1

        System.out.println("Problema 1");
        for (i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print(" ");
        }

        for (i = 4; i > 0; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print("#");
            }
            System.out.print(" ");
        }


        while (i!= 0){
            i--;
        }


        System.out.println();

       //Problema 2
        System.out.println("Problema 2");
       Scanner reader = new Scanner(System.in);
       System.out.println("Introduceti un numar la intamplare pentru verificarea paritatii (par / impar): ");
       int numarIntamplator = reader.nextInt();
       int numarPasi =0;

       while(numarIntamplator!=1) {
           if ((numarIntamplator % 2) == 0) {
               numarIntamplator = numarIntamplator / 2;
               System.out.println("Numar par =>" + numarIntamplator);
               numarPasi=numarPasi+1;
           } else {
               numarIntamplator = 3 * numarIntamplator + 1;
               System.out.println("Numar impar =>" + numarIntamplator);
               numarPasi=numarPasi+1;
           }
       }
       System.out.println("Numar de pasi= " + numarPasi);

       //Problema 3
        System.out.println("Problema 3 - construirea unui sir aleator de lungime aleatorie");
        System.out.println("Introduceti lungimea sirului:");
        int numarLaIntamplare = reader.nextInt();
        int [] arrayCuValoriLaIntamplare = new int[numarLaIntamplare];
        for (i = 0; i < numarLaIntamplare; i ++){
            System.out.println("Introduceti valoarea(int) pentru pozitia " + i);
            arrayCuValoriLaIntamplare[i]= reader.nextInt();
        }
        System.out.println();
        int maxImpar=0;
        boolean numereImpare = false;
        for (i = 0; i < numarLaIntamplare; i++) {
            System.out.print(arrayCuValoriLaIntamplare[i]);
            if (((arrayCuValoriLaIntamplare[i] % 2) != 0) && (arrayCuValoriLaIntamplare[i] > maxImpar)) {
                maxImpar = arrayCuValoriLaIntamplare[i];
                numereImpare = true;
            }
        }
        if (numereImpare == false){
            System.out.println("no - Nu exista valori impare in sirul introdus");
        }else {
            System.out.println("Valoarea numarului impar maxim: " + maxImpar);
            System.out.println("Sirul introdus: ");
            for (i = 0; i < numarLaIntamplare; i++) {
                System.out.print(arrayCuValoriLaIntamplare[i] + " ");
            }
        }

    }
}
