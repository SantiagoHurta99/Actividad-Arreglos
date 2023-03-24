package Punto_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hand {
	Card[] mano = new Card[5];
	ArrayList<Card> baraja = new ArrayList<>(Arrays.asList(new Deck().getCardArray()));
	int totalPuntos = 0;

	public Hand() {
		int min_val = 0;
		int max_val = 51;
		int numRandom = 0;
		for (int i = 0; i < 2; i++) {
			numRandom = (int) (Math.random() * (max_val - min_val));
			mano[i] = baraja.get(numRandom);
			baraja.remove(numRandom);
			totalPuntos += mano[i].points;
		}
	}

	public void print() {
		for (int i = 0; i < mano.length; i++) {
			if (mano[i] != null) {
				System.out.println(mano[i]);
			}
		}
		System.out.println("Puntos acumulados: " + totalPuntos);
	}

	public int contarCartas() {
		int cantidadCartas = 0;
		for (int i = 0; i < mano.length; i++) {
			if (mano[i] != null) {
				cantidadCartas++;
			}
		}
		return cantidadCartas;
	}

	public void adicionarCarta() {
		int cantidadCartas = contarCartas();
		int min_val = 0;
		int max_val = baraja.size();
		int numRandom = 0;
		for (int i = 0; i < mano.length; i++) {
			numRandom = (int) (Math.random() * (max_val - min_val));
			if (mano[i] != baraja.get(numRandom)) {
				for (int j = 0; j < mano.length; j++) {
					if (mano[j] == null) {
						mano[j] = baraja.get(numRandom);
						baraja.remove(numRandom);
						if (cantidadCartas > 3) {
							totalPuntos += baraja.get(numRandom).points;
						} else {
							totalPuntos += baraja.get(numRandom).points - 1;
						}
						j = mano.length;
					}
				}
				i = mano.length;
			}
		}
	}
}
