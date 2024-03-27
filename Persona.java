package Clases;
//Clase crea con sus atributos o caractericas (variables) y sus métodos o comportamientos (funciones)//
public class Persona {

    public String nombre;
    public byte edad = 0;

    public double estatura = 0;

    public double peso = 0;

    public String dni = null;

    public void cumplirAnio() {
        System.out.println("feliz cumpleaños "+nombre);
        System.out.println("tu edad ahora es " + (edad +1)+ " años");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void crecer(double incremento) {
        estatura += incremento;//reemplazamos el dato inicial de


    }
}