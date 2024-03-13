import java.util.Scanner;

public class Datos_Personales {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = sn.next();
        System.out.println("Cual es tu apellido");
        String apellido= sn.next();
        System.out.println("Cual es tu edad");
        byte edad = sn.nextByte();
        System.out.println("Muestra tu nombre "+ nombre +" "+ apellido+" "+ edad );
    }

}
