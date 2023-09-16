package br.com.projeto.converters;

public class NumberConverter {
	public static boolean isZero(String strNumber) {
		var number = convertToDouble(strNumber);
		
		if (number == 0) return true;
		
		return false;
	}
	
	public static Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		String number = strNumber.replace(',', '.');
		
		if(isNumeric(number)) return Double.parseDouble(number);
		
		return null;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replace(',', '.');
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
