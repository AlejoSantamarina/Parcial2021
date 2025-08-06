public class CondicionCaract implements Condicion {
    private String caract;

    public CondicionCaract(String caract) {
        this.caract = caract;
    }

    public boolean cumple(ElemUn e) {
        return e.getCaract().contains(caract);
    }
}
