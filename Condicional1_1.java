import java.util.Scanner;

public class Condicional1_1 {

    public static void main(String[] args) {
       int edad;
       Scanner sn=new Scanner(System.in);
       System.out.println("Indica tu edad");
       edad= sn.nextInt();
       if (edad<18) System.out.println("no puedes entrar a este pub ni comprar tabaco");
       else System.out.println("debes pagar 5€ para entrar ");

       //if anidados
       if (edad>18) {
          System.out.println("entras sin problema");
       } else if (edad > 5){//mayor que 5 y menor que 18
          System.out.println("estas en primaria");

       }
       }


}