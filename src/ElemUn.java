import java.util.ArrayList;

public abstract class ElemUn {
    private String nombre;

    public ElemUn(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getOrigen();
    public abstract double getPrecio();
    public abstract int getPeso();
    public abstract int getDureza();
    public abstract ArrayList<String> getCaract();
    public abstract ArrayList<ElemUn> buscar(Condicion c);
    public abstract ElemUn getCopia(Condicion c);
}
