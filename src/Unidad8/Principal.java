public class Principal {

    public static void main(String[] args) {

        Persona pedro = new Persona();

        pedro.setEdad(42);
        pedro.setNombre("Pedro");
        pedro.setTelefono(1234);

        System.out.println("Hola, mi nombre es " + pedro.getNombre());
        System.out.println("La edad de " + pedro.getNombre() + " es: " + pedro.getEdad());
        System.out.println("El telefono de " + pedro.getNombre() + " es: " + pedro.getTelefono());
    }
}
