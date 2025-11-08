

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner iAge = new Scanner(System.in);
        int pers1 = iAge.nextInt();
        int pers2 = iAge.nextInt();
        iAge.close();
        System.out.println((pers1+pers2)/2);
    }

}
