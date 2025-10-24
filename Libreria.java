public class Libreria {

    private String nombre;
    private String direccion;
    private String telefono;
    private PilaFactura pilaFacturas = new PilaFactura();

    public Libreria(String nombre, String direccion, String telefono, PilaFactura pilaFacturas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pilaFacturas = pilaFacturas;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", pilaFacturas=" + pilaFacturas +
                '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public PilaFactura getPilaFacturas() {
        return pilaFacturas;
    }

    public void setPilaFacturas(PilaFactura pilaFacturas) {
        this.pilaFacturas = pilaFacturas;
    }
    
}