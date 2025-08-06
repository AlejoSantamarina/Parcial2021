public class CondicionPrecioMayor implements Condicion {
    private double precio;

    public CondicionPrecioMayor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(ElemUn e) {
        return e.getPrecio() > precio;
    }
}
