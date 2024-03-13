import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        Scanner sn = new Scanner (System.in);

        System.out.println("Cuanto dinero tienes en el banco");
        double banco = sn.nextDouble();
        System.out.println("Cuanto dinero tiene en la hucha");
        double hucha = sn.nextDouble();
        System.out.println("Cuanto dinero tengo en el bolsillo");
        double bolsillo = sn.nextDouble();
        System.out.println("Cuanto dinero tengo en el cajon");
        double cajon = sn.nextDouble();
        double suma = banco + hucha + bolsillo + cajon;
        System.out.println("tienes un total de " + suma + "€");


    }
}
