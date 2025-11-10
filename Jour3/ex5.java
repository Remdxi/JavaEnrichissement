import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
       int tbl[] =new int[10];
       Random random=new Random();
       for(int i=0;i<tbl.length;i++){
            int randomint = random.nextInt(0,100);
            tbl[i]= randomint;
       }
       //for(int i=0;i<.length;i++){//version corriger
        //    [(.length-1)-i]=[i];
      // }
    }
}
