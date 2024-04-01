public class Cuentacorriente{
    public String NombreCliente;
    public String dni;
    double saldo;
    public Cuentacorriente(String nombreCliente, String dni) {
        this.NombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo =0;

    }
    public Cuentacorriente(){

    }
    public boolean egreso(double importe) {
        boolean OperacionPosible;
        if (this.saldo >= importe) {
            this.saldo -= importe;
            OperacionPosible = true;


        } else {
            System.out.println("Operacion no es posible ...No tiene saldo");
            OperacionPosible = false;

        }
        return OperacionPosible;

    }
            public void ingresar(double ingreso){
            this.saldo+=ingreso;

        }
            public void mostrarInfo(){
            System.out.println("Nombre del Cliente->" + this.NombreCliente+"\nDNI-> " + this.NombreCliente
                    + "\nSaldo actual-> " + this.saldo);



        }
    }