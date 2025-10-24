public class MultiPila {

    private int n;
    private Pila v[];
    
    public MultiPila(){
        this.n = 0;
        this.v = new Pila[50];
        for (int i = 0; i < 50; i++) {
            v[i] = new Pila();
        }
    }
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return n;
    }
    public void setV(Pila[] v){
        this.v = v;
    }
    public Pila[] getV(){
        return v;
    }
    public void adicionar(int i, Coordenada c){
        if (i < n) {
            v[i].adicionar(c);
        } else {
            System.out.println("Pila no existe");
        }
    }
    public Coordenada eliminar(int i){
        if (i < n) {
            return v[i].eliminar();
        } else {
            System.out.println("Pila no existe");
            return null;
        }
    }
    public boolean esVacia(int i){
        if (i < n) {
            return v[i].esVacia();
        } else {
            System.out.println("Pila no existe");
            return false;
        }
    }
    public boolean esLlena(int i){
        if (i < n) {
            return v[i].esLlena();
        } else {
            System.out.println("Pila no existe");
            return false;
        }
    }
    public void vaciar(Pila p, int i){
        if (i < n) {
            v[i].vaciar(p);
        } else {
            System.out.println("Pila no existe");
        }
    }
    public void vaciar(int i, int j){
        v[i].vaciar(v[j]);
    }
    public void mostrar(int i){
        if (i < n) {
            v[i].mostrar();
        } else {
            System.out.println("Pila no existe");
        }
    }
    public void mostrar(){
        for (int i = 0; i < n; i++) {
            v[i].mostrar();
        }
    }
}