import java.util.ArrayList;

public class GruposYPaquetes extends ElemUn {
    private ArrayList<ElemUn> elementos;

    public GruposYPaquetes(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElemUn elem) {
        elementos.add(elem);
    }

    public String getOrigen() {
        if(elementos.isEmpty()) {
            return null;
        }
        return elementos.get(0).getOrigen();
    }

    public double getPrecio() {
        double precio = 0;
        for(ElemUn elem : elementos) {
            precio += elem.getPrecio();
        }
        return precio;
    }

    public int getPeso() {
        int peso = 0;
        for(ElemUn elem : elementos) {
            peso += elem.getPeso();
        }
        return peso;
    }

    public int getDureza() {
        int menor = 0;
        for(ElemUn elem : elementos) {
            int dureza = elem.getDureza();
            if(dureza < menor) {
                menor = dureza;
            }
        }
        return menor;
    }

    public ArrayList<String> getCaract() {
        ArrayList<String> caract = new ArrayList<>();
        for(ElemUn elem : elementos) {
            for(String caractE : elem.getCaract()) {
                if(!caract.contains(caractE)) {
                    caract.add(caractE);
                }
            }
        }
        return caract;
    }

    public ArrayList<ElemUn> buscar(Condicion c) {
        ArrayList<ElemUn> elementosFiltrados = new ArrayList<>();
        if(c.cumple(this)) {
            elementosFiltrados.add(this);
        }
        for(ElemUn elem : elementos) {
            if(c.cumple(elem)) {
                elementosFiltrados.add(elem);
            }
        }
        return elementosFiltrados;
    }

    public ElemUn getCopia(Condicion c) {
        ArrayList<ElemUn> elementosFiltrados = new ArrayList<>();
        for(ElemUn elem : elementos) {
            if(c.cumple(elem)) {
                elementosFiltrados.add(elem);
            }
        }
        if(elementosFiltrados.isEmpty()) {
            return null;
        }
        GruposYPaquetes gruposYPaquetesCopia = new GruposYPaquetes(getNombre());
        for(ElemUn elem : elementosFiltrados) {
            gruposYPaquetesCopia.agregarElemento(elem);
        }
        return gruposYPaquetesCopia;
    }
}
