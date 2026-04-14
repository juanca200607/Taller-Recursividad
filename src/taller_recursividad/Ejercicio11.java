package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio11 {
    static int sumaArreglo(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumaArreglo(arr, index + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos valores desea ingresar? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor [" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Suma de los elementos del arreglo: " + sumaArreglo(arr, 0));
        sc.close();
    }
}
 