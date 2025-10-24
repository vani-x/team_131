public class Main {
    public static void main(String[] args) {

        // Pila de Facturas
        PilaFactura pilaFacturas = new PilaFactura();

        Libreria libreria = new Libreria("Libreria Paquito", "Calle 123", "25551234", pilaFacturas);

        // los libros deberian estar en una estructura de datos adecuada, aun no implementada
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Editorial A", "Novela", "Nuevo", 500, 29.99);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Editorial B", "Novela", "Nuevo", 400, 24.99);
        Libro libro3 = new Libro("1984", "George Orwell", "Editorial C", "Ciencia Ficción", "Usado", 300, 19.99);

    
        // el carrito de comprar es una funcionalidad, no un dato para una estructura 
        LD_Carrito carrito1 = new LD_Carrito();
        carrito1.adiFinal(libro1);
        carrito1.adiFinal(libro3);

        LD_Carrito carrito2 = new LD_Carrito();
        carrito2.adiFinal(libro2);


        // los clientes y vendedores tambien deberian estar en estructuras de datos adecuadas, aun no implementadas
        Cliente cliente = new Cliente("Juan Perez", "Calle Falsa 123", "98765432", 30, "12345678", 'M', 3, "direccion1", "correo1");
        Vendedor vendedor = new Vendedor("Ana Gomez", "Avenida Siempre Viva 742", "87654321", 28, "87654321", 'F', "caja", 2000);

        // las facturas si estan en una estructura de datos
        Factura factura1 = new Factura("2024-06-01", 49.98, 5.00, cliente, vendedor, carrito1);
        pilaFacturas.adi(factura1);

        Factura factura2 = new Factura("2024-06-02", 24.99, 2.50, cliente, vendedor, carrito2);
        pilaFacturas.adi(factura2);

        //pilaFacturas.mostrar();
        System.out.println(libreria.toString());

    }
    /*
     * Probleas
     * Generación de Reportes de las Transacciones Históricas.
     * Mostrar los Descuentos en la compra de libros para Clientes Destacados.
     * Destacar los Libros más populares.
     * Mostrar las nuevas adquisiciones del negocio.
    */
    public static void generarReporteTransacciones(PilaFactura pilaFacturas) {
        System.out.println("Reporte de Transacciones Históricas:");
        pilaFacturas.mostrar();// esto sera con pdfs si se puede...
    }
    public static void mostrarDescuentosClientesDestacados(PilaFactura pilaFacturas) {
        System.out.println("Descuentos para Clientes Destacados:");
        PilaFactura aux = new PilaFactura();
        while (!pilaFacturas.esVacia()) {
            Factura factura = pilaFacturas.eli();
            if (factura.getCliente().getCantidadCompras() > 5) { // cliente destacado
                System.out.println("Cliente: " + factura.getCliente().getNombre() + ", Descuento: " + factura.getDescuento());
            }
            aux.adi(factura);
        }
        pilaFacturas.vaciar(aux);
    }
    public static void mostrarLibrosPopulares() {
        System.out.println("Libros más Populares:");
        // hacer logica para mostrar libros populares
    }
    public static void mostrarNuevasAdquisiciones() {
        System.out.println("Nuevas Adquisiciones del Negocio:");
        // hacer logica para mostrar nuevas adquisiciones
    }
}
