package Unidad9;

public class Principal {

    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        Trabajador juan = new Trabajador();

        pedro.setEdad(42);
        pedro.setNombre("Pedro");
        pedro.setTelefono(1234);
        pedro.setCredito(23000);

        juan.setEdad(33);
        juan.setNombre("Juan");
        juan.setTelefono(123445);
        juan.setSalario(50000);



        System.out.println("Hola, mi nombre es " + pedro.getNombre());
        System.out.println("La edad de " + pedro.getNombre() + " es: " + pedro.getEdad());
        System.out.println("El telefono de " + pedro.getNombre() + " es: " + pedro.getTelefono());
        System.out.println("El credito de " + pedro.getNombre() + " es: " + pedro.getCredito());
        System.out.println("");

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Hola, mi nombre es " + juan.getNombre());
        System.out.println("La edad de " + juan.getNombre() + " es: " + juan.getEdad());
        System.out.println("El telefono de " + juan.getNombre() + " es: " + juan.getTelefono());
        System.out.println("El salario de " + juan.getNombre() + " es: " + juan.getSalario());
    }
}
