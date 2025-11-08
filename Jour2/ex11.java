import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sFactoriel=new Scanner(System.in);
        int calc;
        
        System.out.println("Veuiller entrer un nombre ENTIER a calculer");
        calc=sFactoriel.nextInt();

        System.out.println("Voici le nombre dont vous voulez calculer le factoriel :"+calc);

        int Fin;
        Fin = Fact(calc);
        Resultat(String.valueOf(Fin));
        sFactoriel.close();
    }
    public static int Fact(int calc){
        int fat=1;
        for(int i=1; i<=calc ;i++ ){
            fat*=i;
        }
        return fat;
    }
    public static void Resultat(String result){
        System.out.println(result);
    }
}
