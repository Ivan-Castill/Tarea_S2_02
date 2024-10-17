class Empleado {
    // Atributos
    private String nombre;
    private String cargo;
    private double salario;
    private String fechaIngreso;
    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }
    //mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        //datos quemados
        Empleado empleado1 = new Empleado("Juan Pérez", "Gerente", 2500.50, "01/03/2020");
        Empleado empleado2 = new Empleado("María López", "Contadora", 1800.75, "12/11/2019");
        Empleado empleado3 = new Empleado("Carlos García", "Ingeniero", 2000.00, "15/08/2018");
        //mostrar la información de los empleados
        System.out.println("Información de los empleados:");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}

