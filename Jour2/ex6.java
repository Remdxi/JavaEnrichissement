

import java.util.Scanner;

public class ex6 
{
        public static void main(String[] args) {
        Scanner sNombres = new Scanner(System.in);
        int iNombre;int iMax;int iMin;
        int somme=0;
        int compteur=0;

        System.out.println("Veuiller entrer un nombre (0 pour arrêter le processus)");
        iNombre=sNombres.nextInt();

        if (iNombre==0) {
                System.out.println("Fin");
        }
        //SAUVGARDER LE MAX ET LE MIN (CHIFFRE PLUS PETIT ET PLUS GRAND)
        iMax = iNombre;
        iMin = iNombre;
         do {
                if (iNombre>iMax) {
                        iMax=iNombre;
                }
                if (iNombre<iMin) {
                        iMin=iNombre;
                }
                //ENREGISTRER LA SOMME TOTAL ET LE NOMBRE D'ENTRER POUR CALCULER LA MOYENNE
                somme+=iNombre;
                compteur++;
         } while (iNombre!=0);
         sNombres.close();
         //CALCULER LA MOYENNE
         double MOYENNE= (double) somme/compteur;
         //LES RESULTAT(J'AI UTILISER CHT POUR TERMINER MAIS L'IDEE VIEN DE MOI C'EST MARQUER EN BAS DE PAGE)
         System.out.println("La plus grande valeur :"+iMax);
         System.out.println("La plus petite valeur :"+iMin);
         System.out.println("La moyenne des valeurs :"+MOYENNE);
        }
}
//POUR NOTER LA PLUS GRANDE VALEUR, 
        //VÉRIFIER SI LA DERNIÈRE VALEUR ENTRER EY PLUS GRNADE OU PLUS PETITE QUE LA DERNIER
        //PUIS CONSERVER LA PLUS GRANDE DANS UNE AUTRE PARAMÈTRE
        //GARDER LA PLUS PETITE EN S'ASSURANT TOUJOUR QUE L'AVANT DERNIÈRE EST PLUS PETITE 
        //QUE LES DEUX PRÉCÉDENTES
// test