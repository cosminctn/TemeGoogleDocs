import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
                String[] mesaj = {"ianuarie", "februarie", "martie", "aprilie", "mai","iunie", "iulie", "august", "septembrie", "noiembrie", "decembrie"};
                Scanner reader = new Scanner(System.in);
                System.out.println(" se da un numar 0 <= n <= 11 (lunile anului, unde 0 -> ianuarie, etc). afisati un mesaj spunand in ce anotimp e luna reprezentata de n.\n" +
                        "la fel, scrieti ambele variante (switch si if).");
                int nNumarNatural = reader.nextInt();

                //metoda 1
                if ((nNumarNatural>11)||(nNumarNatural<0)){
                    System.out.println("Numar in afara intervalului");
                }
                else if ((nNumarNatural>=2)||(nNumarNatural<=4)){
                    System.out.println("primavara");
                }
                else if ((nNumarNatural>=5)||(nNumarNatural<=7)){
                    System.out.println("vara");
                }
                else if ((nNumarNatural>=8)||(nNumarNatural<=10)){
                    System.out.println("toamna");
                }
                else if ((nNumarNatural==11)||(nNumarNatural==0)|| (nNumarNatural == 2)){
                    System.out.println("iarna");
                }

                //metoda 2
                switch (nNumarNatural) {
                    case 0:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("iarna");
                        break;
                    case 1:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("iarna");
                        break;
                    case 2:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("primavara");
                        break;
                    case 3:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("primavara");
                        break;
                    case 4:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("primavara");
                        break;
                    case 5:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("vara");
                        break;
                    case 6:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("vara");
                        break;
                    case 7:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("vara");
                        break;
                    case 8:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("toamna");
                        break;
                    case 9:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("toamna");
                        break;
                    case 10:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("toamna");
                        break;
                    case 11:
                        System.out.println(mesaj[nNumarNatural]);
                        System.out.println("iarna");
                        break;
                    default:
                        System.out.println("numar gresit");
                        break;
                }
            }
        }