public class MultiCola{
    private int n;
    private Cola v[];

    public MultiCola(){
        this.n = 0;
        this.v = new Cola[50];
        for (int i = 0; i < 50; i++) {
            v[i] = new Cola();
        }
    }
    public boolean esVacia(int i){
        return v[i].esVacia();
    }
    public boolean esLlena(int i){
        return v[i].esLlena();
    }
    public void adicionar(int i, Coordenada c){
        if (i < n) {
            v[i].adicionar(c);
        } else {
            System.out.println("Cola no existe");
        }
    }
    public Coordenada eliminar(int i){
        if (i < n) {
            return v[i].eliminar();
        } else {
            System.out.println("Cola no existe");
            return null;
        }
    }
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return n;
    }
    public void setV(Cola[] v){
        this.v = v;
    }
    public Cola[] getV(){
        return v;
    }
    
    public void vaciar(Cola c, int i){
        if (i < n) {
            v[i].vaciar(c);
        } else {
            System.out.println("Cola no existe");
        }
    }
    public void mostrar(int i){
        if (i < n) {
            v[i].mostrar();
        } else {
            System.out.println("Cola no existe");
        }
    }
    public void mostrar(){
        for (int i = 0; i < n; i++) {
            v[i].mostrar();
        }
    }
}