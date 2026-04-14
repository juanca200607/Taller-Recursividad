package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio4 {
    static int sumaDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumaDigitos(n / 10);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("Suma de dígitos de " + n + " = " + sumaDigitos(n));
        sc.close();
    }
}