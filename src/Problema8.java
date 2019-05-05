import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("se dau doua numere naturale a si b. afisati a ^ b (a la puterea b)");
        System.out.print("a: ");
        int a = reader.nextInt();
        System.out.print("b: ");
        int b = reader.nextInt();
        System.out.println("a^b = " + (int) Math.pow(a,b));
    }
}
