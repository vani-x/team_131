


public class Pila <T>{
    private int tope,max=50;
	private T v[];

    public Pila() {
        this.tope = -1;
        v = (T[]) new Object[max]; 
    }


	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(T elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public T eli(){
		T elem = null;
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
        Pila<T> aux = new Pila<>(); 
        System.out.println("--- Contenido de la Pila (cima a base) ---");
        
        while(!esVacia()){
            T elem = eli();
            System.out.println(elem); // to string
            aux.adi(elem);
        } 
        vaciar(aux);
        System.out.println("----------------------------------------");
    }
    public void vaciar(Pila<T> p){ 
        while(!p.esVacia()){
            this.adi(p.eli());
        }
    }
    
    public int NroElem(){
        Pila<T> aux = new Pila<>();
        int c = 0;
        while(!esVacia()){
            T elem = eli();
            aux.adi(elem);
            c++;
        } 
        vaciar(aux);
        return c;
    }
}
