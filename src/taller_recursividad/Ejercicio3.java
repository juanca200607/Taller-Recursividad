package taller_recursividad;
import java.util.Scanner;

public class Ejercicio3 {
    static double sumatoria(int n) {
        if (n == 1) return 1.0;
        return 1.0 / n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor entero n: ");
        int n = sc.nextInt();
        System.out.printf("Sumatoria 1 + 1/2 + ... + 1/%d = %.4f%n", n, sumatoria(n));
        sc.close();
    }
}