public class Factura {

    private String Fecha;
    private double montoTotal;
    private double descuento;
    private Cliente cliente;
    private Vendedor vendedor;
    private LD_Carrito listaLibrosVendidos;

    public Factura(String fecha, double montoTotal, double descuento, Cliente cliente, Vendedor vendedor, LD_Carrito listaLibrosVendidos) {
        Fecha = fecha;
        this.montoTotal = montoTotal;
        this.descuento = descuento;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.listaLibrosVendidos = listaLibrosVendidos;
    }
    public Factura() {}
    @Override
    public String toString() {
        return "Factura{" +
                "Fecha='" + Fecha + '\'' +
                ", montoTotal=" + montoTotal +
                ", descuento=" + descuento +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", listaLibrosVendidos=" + listaLibrosVendidos +
                '}';
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public LD_Carrito getListaLibrosVendidos() {
        return listaLibrosVendidos;
    }
    public void setListaLibrosVendidos(LD_Carrito listaLibrosVendidos) {
        this.listaLibrosVendidos = listaLibrosVendidos;
    }
    
}