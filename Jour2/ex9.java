

import java.util.Scanner;

public class ex9 {
    
    public static void main(String[] args) {
        Scanner sR = new Scanner(System.in);
        double rayon;
        double F;
        
        System.out.println("Veuiller entrer le rayon de votre cercle :");
        rayon=sR.nextDouble();
        System.out.println("Rayon :"+rayon);

        F = circonferance(rayon);
        resultat(String.valueOf(F));

        sR.close();
    }
    public static double circonferance(double rayon)
    {
        double circo;
        circo = 2*Math.PI*rayon;
        return circo;
    }
    public static void resultat(String message){
        System.out.println(message);
    }
}

