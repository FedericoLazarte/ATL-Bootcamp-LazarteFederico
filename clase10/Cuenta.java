package clase10;

public class Cuenta {
    private Persona titular;
    private double cantidad;

    public Cuenta () {

    }

    public Cuenta (Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Persona getTitular () {
        return this.titular;
    }
    public void setTitular (Persona titular) {
        this.titular = titular;
    }

    public double getCantidad () {
        return this.cantidad;
    }
    public void setCantidad (double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + this.titular +
                ", cantidad=" + this.cantidad +
                '}';
    }

    public void mostrar () {
        System.out.println(this);
    }

    public void ingresar (double cantidad) {
        if (cantidad > 0)
            this.cantidad += cantidad;
    }

    public double retirar (double cantidad) {
        if (this.cantidad < 1)
            return 0;
        else {
            this.cantidad -= cantidad;
            return cantidad;
        }
    }
}
