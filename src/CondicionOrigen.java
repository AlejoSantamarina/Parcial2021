public class CondicionOrigen implements Condicion {
    private String origen;

    public CondicionOrigen(String origen) {
        this.origen = origen;
    }

    public boolean cumple(ElemUn e) {
        return e.getOrigen().equals(origen);
    }
}
