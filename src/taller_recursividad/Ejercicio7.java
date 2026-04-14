package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio7 {
    static int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número (M): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el segundo número (N): ");
        int n = sc.nextInt();
        if (m < n) { int temp = m; m = n; n = temp; }
        System.out.println("MCD(" + m + ", " + n + ") = " + mcd(m, n));
        sc.close();
    }
}
 