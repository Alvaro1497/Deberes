package matriz;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// Desarrollar un programa que imprima las siguiente imagen =
		Scanner ec = new Scanner(System.in);
		char A[][] = new char[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					A[i][j] = 1;
				} else {
					A[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}

}
