import java.util.ArrayList;

public class Utensilio extends ElemUn {
    private String origen;
    private double precio;
    private int peso;
    private int dureza;
    private ArrayList<String> caract;

    public Utensilio(String nombre, double precio, int peso, int dureza) {
        super(nombre);
        this.precio = precio;
        this.peso = peso;
        this.dureza = dureza;
        caract = new ArrayList<>();
    }
    public String getOrigen() {
        return origen;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public int getDureza() {
        return dureza;
    }

    public ArrayList<String> getCaract() {
        return caract;
    }

    public ArrayList<ElemUn> buscar(Condicion c) {
        ArrayList<ElemUn> elemVidriera = new ArrayList<>();
        if(c.cumple(this)) {
            elemVidriera.add(this);
        }
        return elemVidriera;
    }

    public ElemUn getCopia(Condicion c) {
        if(c.cumple(this)) {
            Utensilio utensilioCopia = new Utensilio(getNombre(), getPrecio(), getPeso(), getDureza());
            return utensilioCopia;
        }
        return null;
    }
}
