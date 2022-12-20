public class Unidad4 {

    public static void main(String[] args) {

        bucleDoWhile(-16);

    }

    public static void signo(int numeroIf){
        if(numeroIf > 0){
            System.out.println("positivo");
        } else if (numeroIf < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("cero");
        }
    }

    public static void bucleWhile(int numeroWhile){
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void bucleDoWhile(int numeroDoWhile){ //NO ENTENDÍ LA CONSIGNA
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while(numeroDoWhile < 3);
    }

    public static void bucleFor(){
        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void diceEstacion(String estacion){
        switch(estacion) {
            case "verano":
                System.out.println("verano");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            default:
                System.out.println("Se ingreso una palabra que no corresponde a ninguna estación");
        }
    }

}
