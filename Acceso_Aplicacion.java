import javax.swing.*;
public class Acceso_Aplicacion
{
    public static void main(String[] args) {


    String clave="Juan";

    String pass="";

    while (clave.equals(pass)==false){
        pass=JOptionPane.showInputDialog("Introduce la contraseña, porfavor");

        if (clave.equals(pass)==false){

            System.out.println("Contraseña incorreta");
       }


    }
    System.out.println("contraseña correcta acceso permitido");


        }
}
