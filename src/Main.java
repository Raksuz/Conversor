import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APIConv pru = new APIConv();
        MenuConv mnu = new MenuConv();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String base = "";
        String otra = "";
        Double cant = 0.0;
        Double res  = 0.0;
        Tarifa ta;
        do {
            mnu.iniciarMnu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    base = "USD";
                    otra = "COP";
                    System.out.printf("Ingresa la cantidad");
                    cant = entrada.nextDouble();
                    ta = pru.ObtnrJson(base, otra, cant);
                    System.out.println("El resultado es: " + ta.monto() + "pesos");
                    break;
                case 2:
                    base = "USD";
                    otra = "ARS";
                    System.out.printf("Ingresa la cantidad");
                    cant = entrada.nextDouble();
                    ta = pru.ObtnrJson(base, otra, cant);
                    System.out.println("El resultado es: " + ta.monto()  + "pesos");
                    break;
                case 3:
                    base = "USD";
                    otra = "MXN";
                    System.out.printf("Ingresa la cantidad");
                    cant = entrada.nextDouble();
                    ta = pru.ObtnrJson(base, otra, cant);
                    System.out.println("El resultado es: " + ta.monto()  + "pesos");
                    break;
                case 4:
                    base = "MXN";
                    otra = "USD";
                    System.out.printf("Ingresa la cantidad");
                    cant = entrada.nextDouble();
                    ta = pru.ObtnrJson(base, otra, cant);
                    System.out.println("El resultado es: " + ta.monto()  + "pesos");
                    break;
                case 5:
                    base = "ARS";
                    otra = "USD";
                    System.out.printf("Ingresa la cantidad");
                    cant = entrada.nextDouble();
                    ta = pru.ObtnrJson(base, otra, cant);
                    System.out.println("El resultado es: " + ta.monto()  + "pesos");
                    break;
                case 6:
                    base = "COP";
                    otra = "USD";
                    System.out.printf("Ingresa la cantidad");
                    cant = entrada.nextDouble();
                    ta = pru.ObtnrJson(base, otra, cant);
                    System.out.println("El resultado es: " + ta.monto() + "pesos");
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor");
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
            }
        } while (opcion != 7);
    }
}
