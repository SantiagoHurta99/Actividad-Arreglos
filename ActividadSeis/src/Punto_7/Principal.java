package Punto_7;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Punto 7
				Scanner sc = new Scanner(System.in);
				float[] resultPruebas = new float[5];
				for (int i = 0; i < resultPruebas.length; i++) {
					System.out.print("Ingrese la calificación de la prueba " + (i+1) + ": ");
					resultPruebas[i] = sc.nextFloat();
				}
				float promedio = 0;
				for (int i = 0; i < resultPruebas.length; i++) {
					promedio += resultPruebas[i];
				}
				promedio /= resultPruebas.length;
				System.out.println("El promedio de sus calificaciones es: " + promedio);
				
	}
}
