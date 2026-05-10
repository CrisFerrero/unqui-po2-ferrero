package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	//CAMBIAR A PRIVATE
	public int pairCounter(ArrayList <Integer> nl) {
		int amountOfPairNumbers = 0;
		for (int n : nl) {
			if (n % 2 == 0) {
				amountOfPairNumbers += 1;
			}
		}
		return amountOfPairNumbers;
	}
	
}
