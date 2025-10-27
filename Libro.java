public class Libro {

    private String nombre,autor,editorial,genero;
    private String estado;// no se si es necesario lo importate es vender xD
    private int nroPaginas;
    private double precio;
    private String fechaAdquisicion;


    public Libro(String nombre, String autor, String editorial, String genero, String estado, int nroPaginas, double precio, String fechaAdquisicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.estado = estado;
        this.nroPaginas = nroPaginas;
        this.precio = precio;
        this.fechaAdquisicion = fechaAdquisicion;
    }
    public Libro(){}
    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", genero='" + genero + '\'' +
                ", estado='" + estado + '\'' +
                ", nroPaginas=" + nroPaginas +
                ", precio=" + precio +
                ", fechaAdquisicion='" + fechaAdquisicion + '\'' +
                '}';
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getNroPaginas() {
        return nroPaginas;
    }
    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    

    
}