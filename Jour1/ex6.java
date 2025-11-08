

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner typeScanner = new Scanner(System.in);
        int chene = 5; int erable = 12; int pin = 10;
        //SAISIE DE L'AIRE
        System.out.println("Veuiiller entrer un chiffre correspondant à une longeur puis une largeur :");
        int longeur = typeScanner.nextInt();
        int largeur = typeScanner.nextInt();
        //CALCUL DE L'AIRE
        int carree = longeur*largeur;
        System.out.println(carree);
        //VALIDATION DE TYPE DE BOIS
        int sChoixBois;
        do {
        System.out.println("Choisissez parmis ces trois choix : 1-chêne 2-érable 3-pin");
        sChoixBois = typeScanner.nextInt();
        } while (sChoixBois != 1 && sChoixBois != 3 && sChoixBois != 3);
        //CALCULER LE PRIX PAR RAPPORT À L'AIRE=
        if (sChoixBois==1) {
            System.out.println(chene*carree);
        }
        if (sChoixBois==2) {
            System.out.println(erable*carree);
        }
        if (sChoixBois==3) {
            System.out.println(pin*carree);
        }
    }

}
