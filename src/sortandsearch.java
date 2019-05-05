public class sortandsearch {
    public static void main(String[] args) {

        //sortare
        int sirDeNumereNaturale[] = {8, 4, 9, 1, 2, 222,0, 1};
        int lungimeaSirului = sirDeNumereNaturale.length;

        //afisare inainte
        for (int i = 0; i< lungimeaSirului; ++i)
            System.out.print(sirDeNumereNaturale[i] + " ");
        System.out.println();


        for (int i = 0; i < lungimeaSirului; i++)
            for (int j = 0; j < lungimeaSirului-i-1; j++) //tot timpul scad capatul sirului(micsorez distanta cautata)
                if (sirDeNumereNaturale[j] > sirDeNumereNaturale[j+1])
                {
                    int aux = sirDeNumereNaturale[j];
                    sirDeNumereNaturale[j] = sirDeNumereNaturale[j+1];
                    sirDeNumereNaturale[j+1] = aux;
                }

        //afisare dupa
        for (int i = 0; i< lungimeaSirului; ++i)
            System.out.print(sirDeNumereNaturale[i] + " ");
        System.out.println();


        //cautare binara dupa sortare
        int jumatateaSirului = (lungimeaSirului-1)/2;       //stabilim jumatatea sirului
        int numarulCautat = 222;
        int low = 0;
        int high = lungimeaSirului-1;

        while(low<=high){
            if(sirDeNumereNaturale[jumatateaSirului] == numarulCautat){
                System.out.println(jumatateaSirului);
                break;
            }
            else if(sirDeNumereNaturale[jumatateaSirului]<numarulCautat) {
                low = jumatateaSirului + 1;
            }
            else {
                high = jumatateaSirului - 1;
            }
            jumatateaSirului = (low+high)/2;
            System.out.println(sirDeNumereNaturale[jumatateaSirului]);
        }


    }
}
