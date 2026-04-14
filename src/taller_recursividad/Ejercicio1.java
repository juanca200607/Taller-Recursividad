package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio1 {
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        System.out.println("Factorial de " + n + " = " + factorial(n));
        sc.close();
    }
}
 