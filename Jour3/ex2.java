import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sReels=new Scanner(System.in);
        int TableNB [] = new int[10];
        for(int i=0;i<TableNB.length;i++){
            System.out.println("Entrer un nombre entier a insérer");
            TableNB[i]=sReels.nextInt();
        }
        for(int i=0;i<TableNB.length;i++){
            System.out.println(TableNB[i]);
        }
        sReels.close();
    }
}
