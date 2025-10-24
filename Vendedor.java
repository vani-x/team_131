public class Vendedor extends Persona {
    private String rol;
    private double salario;

    public Vendedor(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String ci, char genero, String rol, double salario) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, ci, genero);
        this.rol = rol;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "rol='" + rol + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}