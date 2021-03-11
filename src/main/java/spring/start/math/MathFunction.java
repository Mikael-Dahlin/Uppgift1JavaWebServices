package spring.start.math;

/*
 * Class that holds the math functions.
 */
public class MathFunction {

	/*
	 * Calculate a string of numbers together depending the chosen expression.
	 */
	public static String calcutale(String numbers[], String expression) {
		double number, result = 0;
		
		// Loop through the array.
		for( int i = 0; i < numbers.length; i++) {
			try{
				// Converts the string to double, if it can not the string is ignored.
				number = Double.parseDouble(numbers[i]);
			} catch(NumberFormatException e) {
				if (expression == "add" || expression == "sub") {
					number = 0;
				} else {
					number = 1;
				}
			}
			
			// First number gets put in the results.
			if(i == 0) {
				result = number;
			} else {
				// All other numbers will use the chosen expression.
				switch(expression){
					case "add" :
						result += number;
						break;
					case "sub" :
						result -= number;
						break;
					case "mult" :
						result *= number;
						break;
					case "div" :
						result /= number;
				}
			}
		}
		
		return "<h3>" + result + "</h3>";
	}
}
