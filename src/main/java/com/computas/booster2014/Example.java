package com.computas.booster2014;

public class Example {

	int max(int[] array) {
		int m = array[0];
		for (int element : array) {
			if (elementAtPosition(element, m))
				m = element;
		}
		return m;
	}

	private boolean elementAtPosition(int element, int m) {
		return element > m;
	}

}
