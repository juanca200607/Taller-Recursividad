package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio2 {
    static void invertir(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        invertir(n / 10);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        System.out.print("Número invertido: ");
        invertir(n);
        System.out.println();
        sc.close();
    }
}
 