
package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio9 {
    static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) return 0;
        return 1 + cociente(dividendo - divisor, divisor);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();
        System.out.println("Cociente de " + dividendo + " / " + divisor + " = " + cociente(dividendo, divisor));
        sc.close();
    }
}
 