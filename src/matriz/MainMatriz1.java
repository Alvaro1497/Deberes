package matriz;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// 1)declare una matriz A de 3 filas 4 columnasdesarrolle un programa que
		// solicite cada una de sus posciones
		// i=fila
		// j=columna
		
		Scanner ec = new Scanner(System.in);
		System.out.println("INGRESE FILAS ");
		int N = ec.nextInt();
		System.out.println("INGRESE COLUMNAS ");
		int C = ec.nextInt();
		
		char A[][] = new char[N][C];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("ingrese el valor fila " + i + " columna: " + j + " = ");
				// el usuario digita el valor por teclado
				char n = ec.next().charAt(0);
				A[i][j] = n;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}
