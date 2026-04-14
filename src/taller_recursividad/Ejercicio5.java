package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio5 {
    static int sumatoria(int n) {
        if (n == 0) return 0;
        return n + sumatoria(n - 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        System.out.println("Sumatoria 1 + 2 + ... + " + n + " = " + sumatoria(n));
        sc.close();
    }
}
 