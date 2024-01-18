package actividades;
//*//Escribir un programa que pida un número al usuario y muestre
    //su valor absoluto

import java.util.Scanner;

public class Actividad1_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número (positivo o negativo): ");
                int n = sc.nextInt();
                int valorAdsoluto = Math.abs(n);
                System.out.println("El valor adsoluto de " + n + " es " + valorAdsoluto);
    }
}
