import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sPhrase = new Scanner(System.in);
        String sEntrer;
        System.out.println("Veuiller entree une suite de caractère :");
        sEntrer = sPhrase.nextLine();
        System.out.println(sEntrer.toUpperCase());
    }

}
