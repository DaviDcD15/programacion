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
        }
            public void insertarLista (Lista nuevaLista){
                //1. La longitud de la lista original


                int logOriginal = elemento.length;
                //2. Hacer hueco.
                elemento = Arrays.copyOf(elemento, elemento.length+nuevaLista.elemento.length);
                //Ejem. [60,80,100, null, null, null, null, null, null, null]
                //3.Copiar la lista
                System.arraycopy(nuevaLista.elemento,0,elemento,logOriginal,nuevaLista.elemento.length);
                System.out.println(Arrays.toString(elemento));
            }
                public void eliminarNum(int indice) {
                if (elemento.length>indice && indice >=0){
                    Integer numeroEliminar=elemento[indice];//eje: 100 -indice =2
                    for (int i = indice+1; i<elemento.length; i++){
                        elemento [i-1]=elemento[i];
                        elemento = Arrays.copyOf((elemento,elemento.length-1);
                        System.out.println("el numero ["+numeroEliminar+"] sera eliminado del Array");
                        System.out.println(Arrays.toString(elemento));



                    }


                }
                }

//buscar numero que pasen por parametro
            public void buscarNum(Integer num){
                    int indice =-1; //
                        for (int i = 0; i<elemento.length && indice == -1; i++) {
                            //para compara el interger ==...sinon equal -> porque es un Array
                            if elemento [i].equals(num){
                            indice =i;
                            }
                        }
                        if (indice!=-1);{
                            System.out.println("El numero buscando ["+num+"]; esta en la posción "+indice );
                    }else{
                    System.out.println("el número buscado [" + num + "] no ha sido encontrado");

                }

                }


            //Metodos para concatenas dos arrays

            1//para concatenar dos listas vamos crear dos listas donde una tercera lista se guardará

        public Lista concatenarListas(Lista l1, Lista l2){
                    Lista nuevaLista=new Lista();

         //

                for (Integer e:l1.elemento) {
                    nuevaLista.insertarUltimo(e);
                }
                System.out.println("El resultado de concatenar la lista 1 co la lista 2 es" +

                        Arrays.toString(nuevaLista.elemento));
                return nuevaLista;

            }


         }





