public class NodoCarrito {

    private Libro libro;

    private NodoCarrito ant,sig;

    public NodoCarrito() {
        this.ant = null;
        this.sig = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoCarrito getSig() {
        return sig;
    }

    public void setSig(NodoCarrito sig) {
        this.sig = sig;
    }
    public NodoCarrito getAnt() {
        return ant;
    }
    public void setAnt(NodoCarrito ant) {
        this.ant = ant;
    }
}