package actividades;
//Escribir un programa que pida un número al usuario e inque mediante
//literal booleano (true o false) si es el número es par

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        //*los números pares tienen la propiedad que al dividirlos por
        //dos la división es esacta, es decir, el resto (módulo) de la división
        //siempre es 0 "/
        int numero;
    System.out.print("Escriba un numero:");
//es habitual crear y leer de un Scanner hacer haciéndolo en la misma instrucción
 numero = new Scanner(System.in) .nextInt();
 boolean esPar = (numero % 2) == 0; //calcula el resto de dividir el número entre 2 y el
 //resultado de esta operación la compara con 0
        System.out.println("es par : " + esPar);

}
}

