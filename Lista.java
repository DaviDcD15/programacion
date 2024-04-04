import java.util.Arrays;

public class Lista {
    Integer[] elemento;
     public Lista() {
         elemento=new Integer[0];
     }

    public void insertarPrincipio(Integer nuevo) {
    //1. Aumentar la tabla.
        elemento = Arrays.copyOf(elemento, elemento.length + 1);

        //2. Crear hueco al principo de la tabla.
        elemento[0] = nuevo;
        System.arraycopy(elemento, 0, elemento, 1, elemento.length - 1);

    //3. Insertar el elemento.
        elemento[0] = nuevo;
    }

    //Insertar en el último sitio de la tabla.
    public void insertarUltimo (Integer nuevo) {

        elemento = Arrays.copyOf(elemento, elemento.length + 1);
        elemento[elemento.length - 1] = nuevo;
    }
    //Obtener el número de elementos insertados
        public void mostrarElementos() {
            System.out.println("Número de elementos->" + elemento.length);
            System.out.println("Todos los elementos->" + Arrays.toString(elemento));
        }
    //Insertar un elemento, pero nos indican el indice donde insertarlo
        public void insertarConindice (int indice, Integer nuevo) {
            //Validamos que el indice pasado por parametro es menor que el parametro del array

            if (elemento.length > indice) {
                elemento = Arrays.copyOf(elemento, elemento.length + 1);
                System.arraycopy(elemento, indice, elemento, indice + 1, elemento.length - indice - 1);
                //[1,2,3,4,5,6,7] -> 4,10 -> [1,2,3,4,] [5,6,7]
                elemento[indice] = nuevo;
            } else {
                System.out.println("el indice indicado es fuera de rango!");
                //Insertar otra lista dentro de la lista original
            }

            public void insertarLista (lista nuevaLista){
                //1. La longitud de la lista original

                int logOriginal = elemento.length;
                //2. Hacer hueco.
                elemento = Arrays.copyOf(elemento, elemento.length + nuevaLista.elemento.lengh);
                //Ejem. [60,80,100, null, null, null, null, null, null, null]
                System.out.println(Arrays.toString(elemento));
                //3.Copiar la lista
                System.arraycopy(nuevaLista.elemento, logOriginal, nuevaLista.elemento.leght);
                System.out.println(Arrays.toString(elemento));
            }
        }
