
package taller_recursividad;
import java.util.Scanner;
 
public class Ejercicio12 {
    static int sumaMatriz(int[][] mat, int fila, int col, int cols) {
        if (fila == mat.length) return 0;
        if (col == cols) return sumaMatriz(mat, fila + 1, 0, cols);
        return mat[fila][col] + sumaMatriz(mat, fila, col + 1, cols);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        System.out.println("Suma de todos los elementos: " + sumaMatriz(matriz, 0, 0, n));
        sc.close();
    }
}
 