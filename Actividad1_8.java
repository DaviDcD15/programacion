package actividades;
/*Realizar una aplicacion que solicite al usuario su edad y le indique si es mayor
* de edad mediante unliteral booleano: true o false  */


import java.util.Scanner;

public class Actividad1_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("escriba su edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18; // ser mayor de edad implica que la
       // edad sea mayor o igual que 18;
        System.out.println("Mayoria de edad: " + mayorEdad);

    }




    }

