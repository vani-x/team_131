public class LD_Carrito {
    // lista doblemente enlazada de nodos de carrito
    private NodoCarrito p;

    public LD_Carrito() {
        this.p = null;
    }

    public NodoCarrito getP() {
        return p;
    }
    public void setP(NodoCarrito p) {
        this.p = p;
    }
    public boolean esVacia() {
		if(p == null)
			return true;
		return false;
	}

	public void adiPrincipio(Libro z) {
		NodoCarrito nuevo = new NodoCarrito(); //composicion
		nuevo.setLibro(z);
		nuevo.setSig(p); //el siguiente del nodo nuevo apunta a nodo raiz
		p = nuevo;      //p apunta a nuevo
	}
	
	public void adiFinal(Libro z) {
		NodoCarrito nuevo = new NodoCarrito();
		nuevo.setLibro(z);

		if(esVacia())
			p = nuevo;   //p apunta a nuevo
		else {
			NodoCarrito R = p;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoCarrito R = p;   //R apunta  a la raiz p
		while(R != null) {
			System.out.println(R.getLibro());
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoCarrito R = p;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	
	public NodoCarrito eliPrincipio() {
		NodoCarrito x = null;    
		if(!esVacia()) {
			x = p ;     // x apunta a la raiz p
			p = p.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoCarrito eliFinal() {
		NodoCarrito x = null;
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = p;      //x apunta a la raiz p
				p = null;
			}else {
				NodoCarrito R = p;
				NodoCarrito S = p;
				while(R.getSig() != null) {
					S = R;         //S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
    
}