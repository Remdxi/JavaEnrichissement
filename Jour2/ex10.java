import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int iN1;int iN2;
        Scanner sPLuGrand=new Scanner(System.in);

        System.out.println("Veuiller entrer un nombre");
        iN1=sPLuGrand.nextInt();
        iN2=sPLuGrand.nextInt();

        System.out.println("Voici les deux nombres :"+iN1+" et "+iN2);
        
        int PlusGrand;
        PlusGrand=PlusGrand(iN1, iN2);

        resultat("Le nombre le plus grand est :"+String.valueOf(PlusGrand));

        sPLuGrand.close();
    }
    public static int PlusGrand(int iN1,int iN2){
        int Big=0;
        if (iN1>iN2) {
            Big=iN1;
        }
        else if (iN2>iN1) {
            Big=iN2;
        }
        return Big;
    }
    public static void resultat(String results){
        System.out.println(results);
    }
//UNE FACON PLUS SIMPLE DE FAIRE AFFICHER LE NIMBRE PLUS GRAND
//public static int PlusGrand(int iN1, int iN2) {
//    return Math.max(iN1, iN2);
//}

}
