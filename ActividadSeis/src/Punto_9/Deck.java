package Punto_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
	private Card[] cardArray = new Card[52];

	Deck() { // constructor
		int suits = 4; //-Diamonds(♦ ♢) -Clubs(♣ ♧) -Spades(♠ ♤) -Hearts(♥ ♡)
		int cardType = 13;
		int cardCount = 0;
		for (int i = 1; i <= suits; i++)
			for (int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i, j);
				cardCount++;
			}
	}

	public Card[] getCardArray() {
		return cardArray;
	}
	
	public void setCardArray(Card[] cardArray) {
		this.cardArray = cardArray;
	}
	
	public Card getRandomCard(int num) {
		return cardArray[num];
	}

	public void print() {
		for (int i = 0; i < cardArray.length; i++)
			System.out.println(cardArray[i]);
	}
	
	public void mezclar() {
		// Convertir el array en una lista
        ArrayList<Card> lista = new ArrayList<>(Arrays.asList(cardArray));
        
        // Mezclar los elementos de la lista en orden aleatorio
        Collections.shuffle(lista);
        
        // Convertir la lista de nuevo a un array
//        Card[] arrayAleatorio = lista.toArray(new Card[lista.size()]);
        cardArray = lista.toArray(new Card[lista.size()]);
        
        // Imprimir el array ordenado aleatoriamente
//        System.out.println(Arrays.toString(arrayAleatorio));
        print();
	}
}
