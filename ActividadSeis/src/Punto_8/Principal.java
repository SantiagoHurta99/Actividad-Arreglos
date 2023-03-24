package Punto_8;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int[][] A = new int[2][2];
		int[][] B = new int[2][2];
		char op = 'A';
		while (op != 'F') {
			op = JOptionPane.showInputDialog("A. Enter Arreglo A\r\n" + "B. Enter Arreglo B\r\n"
					+ "C. Display A + B\r\n" + "D. Display A - B\r\n" + "E. Display A * B\r\n" + "F. Exit").charAt(0);
			op = Character.toUpperCase(op);
			switch (op) {
			case 'A':
				for (int i = 0; i < A.length; i++) {
					for (int j = 0; j < A.length; j++) {
						A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion A[" + i + "][" + j + "]"));
						System.out.println("A[" + i + "][" + j + "] = " + A[i][j]);
					}
				}
				break;
			case 'B':
				for (int i = 0; i < B.length; i++) {
					for (int j = 0; j < B.length; j++) {
						B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion B[" + i + "][" + j + "]"));
						System.out.println("B[" + i + "][" + j + "] = " + B[i][j]);
					}
				}

				break;
			case 'C':
				int[][] suma = new int[2][2];
				for (int i = 0; i < A.length; i++) {
					for (int j = 0; j < A.length; j++) {
						suma[i][j] = A[i][j] + B[i][j];
						System.out.println("suma[" + i + "][" + j + "] = " + suma[i][j]);
					}
				}

				break;
			case 'D':
				int[][] resta = new int[2][2];
				for (int i = 0; i < A.length; i++) {
					for (int j = 0; j < A.length; j++) {
						resta[i][j] = A[i][j] - B[i][j];
						System.out.println("resta[" + i + "][" + j + "] = " + resta[i][j]);
					}
				}
				break;
			case 'E':
				int num1 = 0;
				int num2 = 0;
				int contador = 0;
				int[][] multiplicacion = new int[2][2];
				for (int i = 0; i < A.length; i++) {
					for (int j = 0; j < A.length; j++) {
						for (int k = 0; k < 2; k++) {
							multiplicacion[i][j]+= A[i][k] * B[k][j];
						}
						System.out.println("multiplicacion[" + i + "][" + j + "] = " + multiplicacion[i][j]);
					}
				}
				break;
			case 'F':

				break;
			default:
				JOptionPane.showMessageDialog(null, "El caracter ingresado es invalido.");
				break;
			}

		}
	}
}
