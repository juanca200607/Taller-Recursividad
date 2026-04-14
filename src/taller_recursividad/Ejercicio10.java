package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio10 {
    static int multiplicar(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicar(a, b - 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.println(a + " x " + b + " = " + multiplicar(a, b));
        sc.close();
    }
}
 