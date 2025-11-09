import java.util.Random;

//tableaux
public class ex3 {
    public static void main(String[] args) {
        Random random=new Random();
        //int randomInt=random.nextInt(0,10); ERREUR il fuat mettre le random dans la boulce pour obtenire plusieurs resultat
        int tblNRM[]=new int[4];
        int tblRVS[]=new int[4];

        for(int i=0;i<tblNRM.length;i++){
            int randomInt=random.nextInt(0,10);
            tblNRM[i]=randomInt;
        }

        for(int i=0;i<tblNRM.length;i++){//version corriger
            tblRVS[(tblRVS.length-1)-i]=tblNRM[i];
        }

        for(int i=0;i<tblNRM.length;i++){
            System.out.println(" original: "+tblNRM[i]);
          
            System.out.println("reversed :"+tblRVS[i]);
        }
    }
}
