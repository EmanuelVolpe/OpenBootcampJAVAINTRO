package Unidad3;

public class Main {
    public static void main(String[] args) {

        /*int suma = Sumatoria(1,10,4);
        System.out.println("Sumatoria: " + suma);*/

        Coche coche = new Coche(4);
        coche.incrementaNumPuertas(2);
        System.out.println(coche.getNumPuertas());
    }

    public static int Sumatoria(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
