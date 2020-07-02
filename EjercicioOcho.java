package ejercicio.ocho;

import java.util.Scanner;

public class EjercicioOcho {
    public static Scanner sc = new Scanner (System.in);
    public static Double n, res;
    
    public static void entrada() {
        System.out.print("Digita el número a verificar: ");
        n = sc.nextDouble();
    }
    
    public static void EsCubo() {
        res = Math.cbrt(n);
    }

    public static void main(String[] args) {
        entrada();
        EsCubo();
        System.out.println(n+" es "+res+" al cubo");
    }
    
}
