public class Cliente extends Persona {
    private int cantidadCompras;
    private String direccion,correo;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String ci, char genero, int cantidadCompras, String direccion, String correo) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, ci, genero);
        this.cantidadCompras = cantidadCompras;
        this.direccion = direccion;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cantidadCompras=" + cantidadCompras +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                "} " + super.toString();
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }

    public void setCantidadCompras(int cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}