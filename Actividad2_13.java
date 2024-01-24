import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        System.out.println("introduzca hora");
        h = sc.nextInt();
        System.out.println("introduzca minutos");
        m = sc.nextInt();
        System.out.println("introduzca segundos");
        s = sc.nextInt();

        s++;
        if (s > 59) {
            s = 0;
            m++;
            if (m > 59) ;
            m = 0;
            h++;
            if (h > 23)
                h = 0;
        }


        System.out.println("hora + 1 segundo: " + h + ":" + m + ":" + s);
    }

}
