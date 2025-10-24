public class CCircular {

    private int ini,fin,max;
    private Coordenada[] v;
    public CCircular() {
        this.ini = 0;
        this.fin = 0;
        this.max = 50;
        this.v = new Coordenada[max];
    }
    public boolean esVacia() {
        // la cola circular tiene otra logica
        return ini == fin;
    }
    public boolean esLlena() {
        // la cola circular tiene otra logica
        return (fin + 1) % max == ini;
    }
    public void adicionar(Coordenada c) {
        if (!esLlena()) {
            v[fin] = c;
            fin = (fin + 1) % max;
        } else {
            System.out.println("Cola llena");
        }
    }
    public Coordenada eliminar() {
        if (!esVacia()) {
            Coordenada c = v[ini];
            ini = (ini + 1) % max;
            return c;
        } else {
            System.out.println("Cola vacia");
            return null;
        }
    }
    public void mostrar() {
        int i = ini;
        while (i != fin) {
            Coordenada c = v[i];
            if (c != null) {
                c.mostrar();
            }
            i = (i + 1) % max;
        }
    }
    
    public void vaciar(CCircular x) {
        while (!x.esVacia()) {
            adicionar(x.eliminar());
        }
    }
}