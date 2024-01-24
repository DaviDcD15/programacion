import java.sql.SQLOutput;
import java.util.Scanner;

public record Condicional2_5() {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int aforo, numeroVendidas;

        double precioEntrada, recaudacion;

        System.out.println("indique el precio de la entrada");
        precioEntrada = sn.nextInt();
        System.out.println("Indica el aforo del local");
        aforo = sn.nextInt();
        System.out.println("Número de entradas vendidas ");
        numeroVendidas = sn.nextInt();
        //calculo de la recaudación
        recaudacion = numeroVendidas * precioEntrada;


        //Tomar decisiones basadas en el AFORO
        if (numeroVendidas < aforo * 0.2) {
            System.out.println("Se CANCELA el concierto");
        } else if (numeroVendidas < aforo * 0.5) {
            precioEntrada = precioEntrada -= (precioEntrada * 0.25);
            recaudacion = numeroVendidas * precioEntrada;
            System.out.println("entradas al 25%");
        } else {
            System.out.println("El concierto es normal");
        }

        System.out.println("la Recaudación del concierto es de" + recaudacion + "€");
    }

}
