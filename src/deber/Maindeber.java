package deber;

public class Maindeber {

	public static void main(String[] args) {
		// 1.declarar un vector A[8]_
		int A[] = new int[8];
		// 2. declara vector z(10)y asignar a todas sus posiciones valores impares

		int Z[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("El valor de la posicion: " + i);

			if (i == 0) {
				System.out.println("1");
			}
			if (i == 1) {
				System.out.println("3");
			}
			if (i == 2) {
				System.out.println("5");
			}
			if (i == 3) {
				System.out.println("7");
			}
			if (i == 4) {
				System.out.println("9");
			}
			if (i == 5) {
				System.out.println("11");
			}
			if (i == 6) {
				System.out.println("13");
			}
			if (i == 7) {
				System.out.println("15");
			}
			if (i == 8) {
				System.out.println("17");
			}
			if (i == 9) {
				System.out.println("19");
			}
		}

		// 3)delcarar un vector h(10)asiganar solo las posiciones impares letras que
		// inician desde la A secuncialmente
		char h[] = new char[10];
		for (int i = 1; i < 10; i++) {
			System.out.println("El valor de la posicion: " + i);
			if (i % 2 != 0) {
				if (i == 1) {
					System.out.println("A");
				}
				if (i == 3) {
					System.out.println("b");
				}
				if (i == 5) {
					System.out.println("c");
				}
				if (i == 7) {
					System.out.println("d");
				}
				if (i == 9) {
					System.out.println("e");
				}
			}

		}
		// 4)declarar vector f(10) base al ejercio anterior asignar los valores de la
		// siguiente manera F[0] = H[3]; F[3] = H[2];F[4] = H[6] F[7] = H[0]
		char f[] = new char[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("El valor de la posicion: " + i);
			if (i == 0) {
				System.out.println("b");
			}
			if (i == 7) {
				System.out.println("A");
			}
			if (i == 9) {
				System.out.println("e");
			}
		}

		// 5) declarar un vector L(15)en base a lo siguiente L[0]= promedio de 3 5 9
		// L[4]
		// la suma de 3 ,5,7,9 L[7]multiplicacion de 6,7,3 L[10]= division de 10/2
		int l[] = new int[15];
		for (int i = 0; i < 15; i++) {
			System.out.println("El valor de la posicion: " + i);
			if (i == 0) {
				System.out.println("6");
			}
			if (i == 4) {
				System.out.println("35");
			}
			if (i == 7) {
				System.out.println("126");
			}
			if (i == 10) {
				System.out.println("5");
			}
		}

		// 6)declar un vecto N(12) y realizar la siguientes asignaciones N[0]= promedio
		// de 3 10 9 N[4] la suma de 8 7 10 N[12]multiplicacion de5 7 3 N[20]= SUMA DE 7
		// - 3 8
		int p[] = new int[12];
		for (int i = 0; i < 12; i++) {
			System.out.println("El valor de la posicion: " + i);
			if (i == 0) {
				System.out.println("7,33");
			}
			if (i == 4) {
				System.out.println("25");
			}
			if (i == 0) {
				System.out.println("7,33");
			}
			if (i == 11) {
				System.out.println("5");
			}

		}
		System.out.println("N[12]  no exite");
		System.out.println("N[20]  no exite");

		// 7)declarar un vector y(3)y asiganar a la posicion 2 el valor de A
		char Y[] = new char[3];
		Y[0] = 'A';

		// 8)declarar un vector A (5) asiganar a la posicion 0 el valor de 25 posicion 3
		// valor de 49 y posicion 2 valor de la posicion 0
		int G[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("El valor de la posicion: " + i);
			if (i == 0) {
				System.out.println("25");
			}
			if (i == 2) {
				System.out.println("5");
			}
			if (i == 3) {
				System.out.println("49");
			}
		}
		// 9)declarar un vector B(10) a la posicion B[0]ASIGNELE EL VALOR DEL VECTOR
		// A[3] del anterior
		int B[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("El valor de la posicion: " + i);
			if (i == 0) {
				System.out.println("49");
			}
		}
		// 10)declarar un vector z[12] y asignar a todas sus posiciones valores que
		// inician desde el 1 y son secuenciales
		int n = 1;

		int j[] = new int[12];
		for (int i = 0; i < 12; i++) {
			System.out.println("El valor de la posicion: " + i);
			System.out.println(n++);
		}

	}

}
