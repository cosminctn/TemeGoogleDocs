import java.util.Scanner;

public class Problema18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("se da un caracter n (char). sa afiseze daca n este o litera ce reprezinta punctele cardinale.\n");
        char caracter = reader.next().charAt(0);
        switch (caracter){
            case 'N':
                System.out.println("Nord");
                break;
            case 'n':
                System.out.println("Nord");
                break;
            case 's':
                System.out.println("Sud");
                break;
            case 'S':
                System.out.println("Sud");
                break;
            case 'E':
                System.out.println("Est");
                break;
            case 'e':
                System.out.println("Est");
                break;
            case 'v':
                System.out.println("Vest");
                break;
            case 'V':
                System.out.println("Vest");
                break;
            default:
                System.out.println("Nu reprezinta punct cardinal");
                break;
        }
    }
}
