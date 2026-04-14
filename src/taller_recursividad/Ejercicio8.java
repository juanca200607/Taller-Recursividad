package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio8 {
    static String copiarCadena(String original, int index) {
        if (index == original.length()) return "";
        return original.charAt(index) + copiarCadena(original, index + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String original = sc.nextLine();
        String copia = copiarCadena(original, 0);
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena copiada:  " + copia);
        sc.close();
    }
}
 