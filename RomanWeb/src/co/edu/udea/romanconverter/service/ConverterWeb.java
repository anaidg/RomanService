package co.edu.udea.romanconverter.service;

public class ConverterWeb {

	String unit[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII",
			"IX" };
	String ten[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	String hundred[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC",
			"CM" };

	public ConverterWeb() {
		super();
	}

	public String toRoman(int number) {
		int unitNumber = number % 10;
		int tenNumber = (number / 10) % 10;
		int hundredNumber = number / 100;
		if (number == 0)
			return null;
		if (number >= 100) {
			return hundred[hundredNumber] + ten[tenNumber] + unit[unitNumber];
		} else {
			if (number >= 10) {
				return ten[tenNumber] + unit[unitNumber];
			} else {
				return unit[unitNumber];
			}
		}
	}
}
