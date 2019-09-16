package Pruebas;

public class BitCounting {
	public static int countBits(int n) {

		int bitNumber = 0;
		Integer number = new Integer(n);
		//Use toBinaryString method from integer, then I loop and compare chars with 1
		String binary = number.toBinaryString(n);
		for (int x = 0; x < binary.length(); x++) {
			if (binary.charAt(x) == '1') {
				bitNumber++;
			}
		}

		return bitNumber;
	}

}
