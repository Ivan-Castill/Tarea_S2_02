import java.util.Scanner;
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
    //registrar un empleado
    public static Empleado registrarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el cargo del empleado: ");
        String cargo = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();  // Consumir la nueva línea después de ingresar el salario
        System.out.print("Ingrese la fecha de ingreso del empleado (dd/mm/yyyy): ");
        String fechaIngreso = scanner.nextLine();
        return new Empleado(nombre, cargo, salario, fechaIngreso);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Registro de empleados:");
        Empleado empleado1 = Empleado.registrarEmpleado();
        Empleado empleado2 = Empleado.registrarEmpleado();
        Empleado empleado3 = Empleado.registrarEmpleado();
        // Mostrar la información
        System.out.println("\nInformación de los empleados:");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}

