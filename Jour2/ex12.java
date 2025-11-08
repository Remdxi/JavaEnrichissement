import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner smax=new Scanner(System.in);
        int max;int min;

        System.out.println("Entrer le nombre maximum");
        max=smax.nextInt();
        do {
            System.out.println("Entrer un minimum");
            min=smax.nextInt();
        } while (min>=(max-2));
        int Fin;
        Fin=sommeMiniMax(max, min);
        Resultat(String.valueOf(Fin));
        smax.close();
    }
    public static int sommeMiniMax(int max,int min){
        int imi=min;
        int somme=0;
        for(int i=imi; i<=max;i++){
            somme+=i;
        }
        return somme;
    }
    public static void Resultat(String result){
        System.out.println(result);
    }
}
