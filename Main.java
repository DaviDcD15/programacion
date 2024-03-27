package Controlador;
//

import Clases.Persona;

public class Main {

    public static void main(String[] args) {

      Persona p = new Persona(); // estoy declarando que p va ser un objeto de tipo persona
      p.nombre = "fran";
      p.edad = 32;
      p.peso = 65;
      p.estatura = 1.78;
      p.dni = "6258745J";


      System.out.println("Nombre->" + p.nombre
              + "\n Edad-> " + p.edad
              + "\n peso-> " + p.peso
              + "\n estatura->" + p.estatura
              + "\n  DNI->" + p.dni);


      Persona x = new Persona();
      x.nombre= "Isabel";
      x.edad = 35;
      x.peso = 65;
      x.estatura = 1.65;
      x.dni = "06258777B";

      System.out.println(" Nombre -> " + x.nombre
              + "\n Edad->" + x.edad
              + "\n peso->" + x.peso
              + "\n estatura->" + x.estatura
              + "\n DNI-> " + x.dni);
      x.cumplirAnio();
      p.crecer(-0.05);
      System.out.println(p.nombre + " ahora mida " + p.estatura);
      x.saludar();
    }


}


