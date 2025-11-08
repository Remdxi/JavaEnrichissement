import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sPhrase = new Scanner(System.in);
        String sEntrer;
        char cRechercher = 'a';
        System.out.println("Veuiller entree une suite de caractère :");
        sEntrer = sPhrase.nextLine();
        System.out.println(sEntrer.toUpperCase());
        System.out.println(sEntrer.length());
        String sChange;
        int icpt = 0;
        for(int i = 0; i < sEntrer.length();i++)
        {
            
            if (sEntrer.charAt(i) == cRechercher ) {
                icpt++;
            }
        }
        sChange = sEntrer.replace('a', '$');
        System.out.println(sChange);
        System.out.println("Voici le nombre de fois que la lettre 'a' fut retrouver");
        System.out.println(icpt);
        sPhrase.close();
    }

}
