public class Factura

{

    public static void main(String[] args) {


        private String codigoArticulo;
        private int cantidadLitros;
        private double precioLitro;

        public Factura(String codigoArticulo, int cantidadLitros, double precioLitro) {
        this.codigoArticulo = codigoArticulo;
        this.cantidadLitros = cantidadLitros;
        this.precioLitro = precioLitro;
    }
         double calcularTotal() {
        return cantidadLitros * precioLitro;
        }

    public static void main(String[] args) {
        Factura facturaAceite = new Factura( 01,  1, 9.99, 3, 29.99, 05, 49.99);
        System.out.println("Total factura aceite: " + facturaAceite.calcularTotal() + " euros");


    }


    }












