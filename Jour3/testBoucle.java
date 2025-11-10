import java.util.Random;

public class testBoucle {
    public static void main(String[] args) {
        int[][] tbl=new int[10][3];
        Random random=new Random();
        for(int i=0;i<tbl.length;i++){
            for(int j=0 ;j<tbl[i].length ;j++){
                int randomint=random.nextInt(0,100);
                tbl[i][j]=randomint;
                System.out.println(tbl[i][j]+" ");
            }
            System.out.println();
        }        
    }
}
