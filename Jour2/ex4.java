

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sValue = new Scanner(System.in);
        int iValue;
        do {
            System.out.println("Veuiller entre une valeur numérique entre 0 et 100 inclusivement");
            iValue = sValue.nextInt();
        } while (iValue >=100 || iValue <=0);
        sValue.close();
    }

}
