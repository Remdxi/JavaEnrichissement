package rivesal.Jour1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner prixScanner = new Scanner(System.in);
        int montant= prixScanner.nextInt();
        prixScanner.close();
        System.out.println(montant*1.25);

    }

}
