import java.util.Scanner;

public class Producto{

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Si el producto 1 vale > 2");

        int producto1 = sn.nextInt();
        int producto2 = sn.nextInt();
        System.out.println("Si el producto 2 vale 0");
        if (producto1 > producto2) {
            //

        } else {

            System.out.println("Si el producto 1 es mayor que el producto 2");

            System.out.println("el producto 2 sera 0");

        }
       }
    }