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
        for(int i=tblRVS.length;i<0;i--){
            tblRVS[i]=randomInt;
        }

        for(int i=0;i<tblNRM.length;i++){
            System.out.println(" original: "+tblNRM[i]);
            System.out.println();
            System.out.print("reversed :"+tblRVS[i]);
        }
    }
}
