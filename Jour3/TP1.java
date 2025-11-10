import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class TP1 {
    public static void main(String[] args) {
        //SCANNER POUR LES CHOIX
        Scanner scan=new Scanner(System.in);
        //SCANNER POUR LES ENTRER EN  INT
        Scanner sChiffre=new Scanner(System.in);
        int iChoix; int iPrix;
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
        int iResult=jeuxargent(iPrix);
        String sResult=String.valueOf(iResult);
        //BOUCLE DE VÉRIFICATION
        
        switch (iChoix) {
            case 1:
                System.out.println("Veuiler entrer un prix");
                iPrix=sChiffre.nextInt();
                System.out.println(sResult);
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                break;
            default:
                break;
        }
        sChiffre.close();
        scan.close();
    }
    //MÉTHODE SI sChoix ÉGALE 1
    public static int jeuxargent(int iPrix) {
        double B100=100;double B50=50;double B20=20;double B10=10;double B5=5; double B2=2;int B1=1;double b25=0.25;double b10=0.10;double b5=0.05;double b1=0.01;
        
        return;
    }
    
}
