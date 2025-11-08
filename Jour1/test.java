

import java.util.Scanner;

public class test 
{
 public static void main(String[] args) 
 
{
Scanner iscan = new Scanner(System.in);
//prendre en compte le salaire horaire(par jour)
int salaire = iscan.nextInt();
//prendre en compte les heures par jours
int heure =  iscan.nextInt();
 iscan.close();
 System.out.println((salaire*heure)*14);


 }
}
