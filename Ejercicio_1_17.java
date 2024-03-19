
import java.io.File;
import java.util.Scanner;

public class Ejercicio_1_17 {

    public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.println("indica los milimetros");
    double milimetros = sn.nextDouble()/10;
    System.out.println("Indica los metros");
    double metros = sn.nextDouble()*100;
    System.out.println("indica los centimetros");
    double centimetros = sn.nextDouble();
    double total= milimetros+metros+centimetros;
        System.out.println("los centimetros sera el resultado de pasar milimetros a centrimetros y metros a centimetros="+total+ "cms");


}



}

