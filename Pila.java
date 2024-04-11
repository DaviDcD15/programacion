public class Pila {
    private Lista lista;

    //Metodo constructor

    /**
     * Método Constructor
     */
    public Pila() {
        lista=new Lista(); // se crea el array asolo en el momento de llamar el constructor
    }

    /**
     * Metodo para apilar
     *
     * @param elemento
     */
    public void apilar (Integer elemento){
        lista.insertarPrincipio(elemento);
    }

    /**
     * Metodo desapilar, que elimina siempre el elemento con indice 0
     */
    public void desapilar () {
        lista.eliminarNum(0);

/**
* Metodo invoca el metodo motrar a la clase lista
*/
public void mostrar(){
lista.mostrarElementos();
            }
    }