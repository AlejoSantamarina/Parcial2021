public class CondicionNOT implements Condicion {
    private Condicion c;

    public CondicionNOT(Condicion c) {
        this.c = c;
    }

    public boolean cumple(ElemUn e) {
        return !c.cumple(e);
    }
}
