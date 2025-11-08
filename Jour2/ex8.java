

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sword=new Scanner(System.in);
        ArrayList<String> sMot =new ArrayList<>();
        String mot;String arret="stop";
        System.out.println("Veuiller entre plsuieurs mot au (saisir 'stop' pour arreter la boucle)");
        do {
            System.out.println("> ");
            mot=sword.nextLine();//SAISIE DE TEXTE
            if (!mot.equalsIgnoreCase(arret)) {//CONFIRMATION
                sMot.add(mot);//AJOUTER LE MOT A LA 'LISTE'
            }
        } while (!mot.equalsIgnoreCase(arret));//BOUCLE 'CONFIRAMTION?'
        System.out.println("Vous avez enter " + sMot.size()+" mot(s) :");//PERMET D'AFFICHER LE NOMBRE DE MOT ENTRER
        
            Collections.sort(sMot);//Trier en ordre alphabetique
            System.out.println(sMot);
        
        sword.close();
    }
}
