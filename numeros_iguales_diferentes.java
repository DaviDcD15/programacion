import java.util.Scanner;

public class numeros_iguales_diferentes

{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int numero1 = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = input.nextInt();

        if(numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }
    }
}
