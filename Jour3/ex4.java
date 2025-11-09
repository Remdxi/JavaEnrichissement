import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        int tbl1[]=new int[5];int max=tbl1[0];int min=tbl1[0];
        Random random=new Random();
        for(int i=0;i<tbl1.length;i++){
            int randomint=random.nextInt(0,100);
            tbl1[i]= randomint;

        }for(int i=0;i<tbl1.length;i++){
            if (tbl1[i]>max) {
                max=tbl1[i];
            }
            if (tbl1[1]<min) {
                min=tbl1[i];
            }
        }
        System.out.println("max ="+max);
        System.out.println("min ="+min);
    }
}
