public class CondicionDurezaMenor implements Condicion {
    private int dureza;

    public CondicionDurezaMenor(int dureza) {
        this.dureza = dureza;
    }

    public boolean cumple(ElemUn e) {
        return e.getDureza() < dureza;
    }
}
