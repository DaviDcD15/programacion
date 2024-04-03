import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;

        Scanner entrada = new Scanner(System.in);
        SintonizadorFM SintonizarFM = new SintonizadorFM();
        do {
            System.out.println(" *** RADIO FM ***");
            System.out.println(" *** 1. Subir");
            System.out.println(" *** 2. Bajar");
            System.out.println(" *** 3. Indicar un favorito ***");
            System.out.println(" *** 4. Indique tu opción ****->");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    SintonizarFM.up();
                    SintonizarFM.display();

                }

                case 2 -> { SintonizarFM.down();
                      SintonizarFM.display();


            }
            case 3 -> {
                System.out.print("indica la frecuencia favorita");
                SintonizarFM.setFrecuencia(entrada.nextDouble());
                SintonizarFM.display();
            }


            case 4 -> System.out.println("----apagando----");
            default -> System.out.println("Opción no valida");


         }


    }while(opcion!=4);



    }


}
