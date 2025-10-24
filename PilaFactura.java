


public class PilaFactura {
    private int tope,max=50;
	private Factura v[];

    public PilaFactura() {
        this.tope = -1;
        this.v = new Factura[max]; 
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
	public void adi(Factura elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Factura eli(){
		Factura elem = null;
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
        PilaFactura aux = new PilaFactura(); 
        System.out.println("*****");
        
        while(!esVacia()){
            Factura elem = eli();
            System.out.println(elem); // to string
			System.out.println("-------------------");
            aux.adi(elem);
        } 
        vaciar(aux);
        System.out.println("*****");
    }
    public void vaciar(PilaFactura p){ 
        while(!p.esVacia()){
            this.adi(p.eli());
        }
    }
    
    public int NroElem(){
        PilaFactura aux = new PilaFactura();
        int c = 0;
        while(!esVacia()){
            Factura elem = eli();
            aux.adi(elem);
            c++;
        } 
        vaciar(aux);
        return c;
    }
}
