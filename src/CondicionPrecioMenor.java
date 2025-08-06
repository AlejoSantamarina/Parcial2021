public class CondicionPrecioMenor implements Condicion {
    private double precio;

    public CondicionPrecioMenor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(ElemUn e) {
        return e.getPrecio() < precio;
    }
}
