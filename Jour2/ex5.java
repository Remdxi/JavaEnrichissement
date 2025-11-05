package rivesal.Jour2;

import java.util.Scanner;

public class ex5 
 {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);

        String sAlphabet ="abcdefghijklmnopqrstuvwxyz";
        String reversed = reverseString(sAlphabet);

        for(int i=0;i<sAlphabet.length();i++)
        {
        System.out.println( sAlphabet.charAt(i));
        }
    
        saisie.nextLine();

        for(int iRvd=0;iRvd<reversed.length();iRvd++)
        {
        System.out.println("Reversed string :"+ reversed.charAt(iRvd));
        }
                                                  
        }
}
