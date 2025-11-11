import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        //SCANNER POUR LES CHOIX
        Scanner scan=new Scanner(System.in);
        //SCANNER POUR LES ENTRER EN  INT
        Scanner sChiffre=new Scanner(System.in);
        int iChoix; double dPrix;
        //AFFICHAGE
        System.out.println("TRAVAIL PRATIQUE #1 - Bryan Dorceus");
        System.out.println("-----------------------------------");
        System.err.println();
        System.out.println("1) Transformer $$$ en monnaie ");
        System.out.println("2) Jeu trouver un nombre mystère");
        System.out.println("3) Quitter");
        System.err.println();
        System.out.println("Choix : ");
        iChoix=scan.nextInt();
        //appeler la deuxieme methode je ne crois pasque ce soit necessaire de faire ca
        int iGuess = 7;//(int) Math.floor(Math.random()*20);
        int iCPT=0;
        //BOUCLE DE VÉRIFICATION
        do {
            System.out.println("Veuiller entrer un nombre valide(1-2-3)");
            iChoix=sChiffre.nextInt();
        } while (iChoix<1||iChoix>3);
        switch (iChoix) {
            case 1:
                System.out.println("Veuiler entrer un prix");
                dPrix=sChiffre.nextInt();
                System.out.println(jeuxargent(dPrix));
                break;
            case 2:
                while (iCPT<7) {
                   System.out.println("Essayer de deviner le nombre qui se situe entre 0-20"); 
                   int iRp;
                   iRp=sChiffre.nextInt();
                   if (iRp==iGuess) {
                    System.out.println(jeuxrandom(iGuess));
                   } 
                }
                break;
            case 3:
                break;
            default:
                break;
        }
        sChiffre.close();
        scan.close();
    }
/*À partir d’une somme d’argent positive donnée au clavier, vous devez donner le nombre minimum de billets et de pièces. Les billets et pièces disponibles sont 100$, 50$, 20$, 10$, 5$, 2$, 1$, 0,25$, 0,10$, 0,05$ et 0,01$. Vous devez afficher un message qui nous donne le nombre de pièces minimum pour le montant choisi.

Exemple : Si j’ai 188,88$, je reçois en monnaie le montant suivant:
1x100$, 1x50$, 1x20$, 1x10$, 1x5$, 1x2$, 1x1$, 3x0,25$, 1x0,10$, 3x0,01$.
 
*/
    //MÉTHODE SI sChoix ÉGALE 1
    //JE SAIS QUE C'EST INCROYABLEMENT LONG MAIS JE VOULAIS VOIR SI SA PRENDRAITBEACOUPS OU PEU DE TEMPS QUAND MÊME
    public static String jeuxargent(double dPrix) {
        double B100=100;double B50=50;double B20=20;double B10=10;double B5=5; double B2=2;int B1=1;double b25=0.25;double b10=0.10;double b5=0.05;double b1=0.01;
        //COMPTEUR DE BILLET
        int cpt100=0;int cpt50=0;int cpt20=0;int cpt10=0;int cpt5=0;int cpt2=0;int cpt1=0;int cpt025=0;int cpt01=0;int cpt010=0;int cpt005=0;int cpt001=0;
        //TESTER UNE SEUL BOUCLE WHILE AVEC TOUS LES PRERQUIS
        //QUI DEMANDE UN TABLEAU

        //billet de 100
        while (dPrix>=B100) {
            dPrix-=100;
            cpt100++;
        }
        //billet de 50
        while (dPrix>=B50) {
            dPrix-=50;
            cpt50++;
        }
        //billet de 20
        while (dPrix>=B20) {
            dPrix-=20;
            cpt20++;
        }
        //BILLET DE 10
        while (dPrix>=B10) {
            dPrix-=10;
            cpt10++;
        }
        //BILLET DE 5
        while (dPrix>=B5) {
            dPrix-=5;
            cpt5++;
        }
        //BILLET DE 2
        while (dPrix>=B2) {
            dPrix-=2;
            cpt2++;
        }
        //BILLET DE 1
        while (dPrix>=B1) {
            dPrix-=1;
            cpt1++;
        }
        //PIÈCE DE MONNAIES
        while (dPrix>=b25) {
            dPrix-=0.25;
            cpt025++;
        }

        while (dPrix>=b10) {
            dPrix-=0.10;
            cpt01++;
        }

        while (dPrix>=b5) {
            dPrix-=0.05;
            cpt005++;
        }

        while (dPrix>=b1) {
            dPrix-=0.01;
            cpt001++;
        }
        String sFin=
        cpt100+" billet de 100 "+
        cpt50+" billet de 50 "+
        cpt20+" billet de 20 "+
        cpt10+" billet de 10 "+
        cpt5+" billet de 5 "+
        cpt2+" billet de 2 "+
        cpt1+" billet de 1 "+
        cpt025+" pièces de 0.25 "+
        cpt010+" pièces de 0.10 "+
        cpt005+" pièces de 0.05 "+
        cpt001+" pièces de 0.01 ";
        return sFin;
    }
    public static String jeuxrandom(int iGuess) {
        /*Vous devez créer un jeu qui permet de trouver un nombre mystère entier entre 1 et 20. L’ordinateur va choisir un nombre aléatoire et vous devez trouver ce nombre. Vous avez 7 chances pour trouver ce nombre. 

        À chaque chance, vous affichez un message à l’écran qui dit si votre nombre est plus petit ou plus grand que le nombre mystère. 

        Le programme s’arrête dès que vous avez trouvé le nombre. Vous affichez un message à l’écran qui dit si vous l’avez trouvé ou non.

        Votre nombre mystère se calcule de la façon suivante : (int)(Math.random()*NombreMax)
        */
        String sReponse="Votre chiffre etait le "+iGuess;
        return sReponse;
    }
}
