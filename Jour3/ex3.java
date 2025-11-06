package rivesal.Jour3;

import java.util.Random;

//tableaux
public class ex3 {
    public static void main(String[] args) {
        Random random=new Random();
        int randomInt=random.nextInt(0,10);
        int tblNRM[]=new int[4];
        for(int i=0;i<tblNRM.length;i++){
            tblNRM[i]=randomInt;
        }
        int tblRVS[]=new int[4];
        for(int i=0;i<tblRVS.length;i++){
            tblRVS[i]=randomInt;
        }
    }
}
