package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio6 {
    static double potencia(double base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " + potencia(base, exp));
        sc.close();
    }
}
 