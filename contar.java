import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tamaño;
		int ini;
		int fin;
		int contMarron = 0;

		System.out.println("Introduce de que tamaño quiere el vector:");
		tamaño = sc.nextInt();
		System.out.println("Introduce de que número a que número con espacio se van a generar los números:");
		ini = sc.nextInt();
		fin = sc.nextInt();

		int numeros [ ] = new int [ tamaño ];

		System.out.println("Se van a generar números de forma aleatoria del " + ini + " al " + fin + ":");

		System.out.println("Posición: | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |" );
		System.out.println("---------------------------------------------------");
		System.out.print("Valor:    | ");
		generarnumeros(numeros, fin, ini);
		System.out.println();
		System.out.println();
		for (int i = 1; i < numeros.length-1; i++) {

			if (numeros[i] == 1 && numeros[i-1] == 2 && numeros[i+1] == 2) {
				contMarron++;
			}
		}
		if (contMarron == 0) {
			System.out.println("NO se ha encontrado un huevo marrón entre dos blancos.");
		}
		if (contMarron > 0) {
			System.out.println("SI se ha encontrado un huevo marrón entre dos blancos.");
		}

	}
	//Esta función nos genera números aleatorios y también nos suma los números generados.
	public static void generarnumeros (int [ ] numeros, int fin, int ini) {
		int res = 0;
		int suma = 0;
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {

			//Esto nos va agenerar números dentro de una array de forma ale
			numeros[i] = (int)((Math.random()*(fin-ini+1)) + ini);
			res = numeros[i];
			System.out.print(res + " | ");
			//Esto nos sirve para calcular la suma de los números generados.
			suma = res + suma;
		}
	}
}
