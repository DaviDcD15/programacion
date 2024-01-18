package actividades; //Un frutero necesesita calcular los benefricios anuales que obtiene
//de la ventade manzanas y peras. por este motivo, es necesario deseñar una aplicación
//que solicite las ventas ( en kilos) de cada semestre para cada fruta. La aplicación mostrará el importe
//total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y de peras en 1,95€
//


import jdk.jshell.ImportSnippet;

import java.util.Scanner;

public class Actividad1_11 {
    //*Los datos de entrada que necesitamos son:
    // * Cantidad vendida en el semestre 1 ( de peras y manzanas)
    //* Cantidad vendida en el semestre 2 (idem) */
    public static void main(String[] args) {
        final double PRECIO_MANZANAS= 2.35; //valores constantes, no varian durante
        //el programa
        final double PRECIO_PERAS = 1.95;
        //los identificadores de costantes los escribimos en mayúsculas
        int vManz1Sem, vManz2Sem; //Ventas (en kilos) por semestre
        int vPeras1Sem, vPeras2Sem;//igual para las peras
        double impTotal; //importe total
        Scanner sc = new Scanner(System.in);
        //pedimos los datos
        System.out.println("Para las manzanas: ");
        System.out.print("Venta (en kilos) del primer semestre: ");
        vManz1Sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre: ");
        vManz2Sem = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del primer semestre: ");
        vPeras1Sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre: ");
        vPeras2Sem = sc.nextInt();
        //Calculamos el importe total obtenido
        impTotal = (vManz1Sem + vPeras2Sem) * PRECIO_MANZANAS;
        impTotal +=(vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;
        System.out.println("el importe total es de: " + impTotal + " euros");
    }

    }





