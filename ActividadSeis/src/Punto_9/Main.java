package Punto_9;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) {
		Deck d = new Deck();
//		d.print();
//		d.mezclar();
		Hand handUser = new Hand();
		Hand handCrupier = new Hand();
		System.out.println("***Hand User ***");
		handUser.print();
		System.out.println();
		System.out.println("***Hand Crupier ***");
		handCrupier.print();
		System.out.println();
		int op = 0;
		boolean user = true;
		boolean crupier = true;

		while (user || crupier) {
			if (user == true && handUser.contarCartas() <= 5 && handUser.totalPuntos < 21 && op != 2) {
				op = Integer.parseInt(JOptionPane.showInputDialog("Desea otra carta?\n1.Si\n2.No"));
				while (op != 1 && op != 2) {
					op = Integer.parseInt(JOptionPane.showInputDialog("Desea otra carta?\n1.Si\n2.No"));
					JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
				}
				switch (op) {
				case 1:
					handUser.adicionarCarta();
					System.out.println("***Hand User***");
					handUser.print();
					System.out.println();
					break;
				case 2:
					user = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
					break;
				}
			} else {
				user = false;
			}
			if (handCrupier.contarCartas() < 5 && handCrupier.totalPuntos < 16) {
				handCrupier.adicionarCarta();
				System.out.println("***Hand Crupier***");
				handCrupier.print();
				System.out.println();
			} else {
				crupier = false;
			}
		}

		if (handUser.totalPuntos <= 21 && (handUser.totalPuntos > handCrupier.totalPuntos || handCrupier.totalPuntos > 21)) {
			System.out.println("\n***Gana User***");
		} else if (handCrupier.totalPuntos <= 21 && handCrupier.totalPuntos > handUser.totalPuntos) {
			System.out.println("\n***Gana Crupier***");
		} else if ((handUser.totalPuntos == handCrupier.totalPuntos)|| (handUser.totalPuntos > 21 && handCrupier.totalPuntos > 21)) {
			System.out.println("\n***Empate***");
		}
	}
}
