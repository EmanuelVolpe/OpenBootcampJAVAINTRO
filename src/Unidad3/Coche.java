package Unidad3;

public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void incrementaNumPuertas(int puertas) {
        this.numPuertas = getNumPuertas() + puertas;
    }
}
