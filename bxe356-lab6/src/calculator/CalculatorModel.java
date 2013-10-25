package calculator;

/**
 * This is the model of this MVC implementation of a calculator.
 * It performs the functions of the calculator and keeps track
 * of what the user has entered.
 * 
 * @author Tom Bylander
 */
public class CalculatorModel {
	/**
	 * This is the numeric value of the number the user is entering,
	 * or the number that was just calculated.
	 */
    private double displayValue;
    
    /**
	 * This is the previous value entered or calculated.
	 */
	private double internalValue;
	
	/**
	 * This is the String corresponding to what the user.
	 * is entering
	 */
	private String displayString;
	
	/**
	 * This is the last operation entered by the user.
	 */
	private String operation;
	
	/**
	 * This is true if the next digit entered starts a new value.
	 */
	private boolean start;
	
	/**
     * This is true if a decimal dot has been entered for the current value.
     */
    private boolean dot;

	/**
	 * Initializes the instance variables.
	 */
	public CalculatorModel() {
		displayValue = 0.0;
		displayString = "" + displayValue;
		internalValue = 0;
		dot = false;
		start = true;
		operation = "";
	}

	/**
	 * @return the String value of what was just calculated
	 * or what the user is entering
	 */
	public String getValue() {
		return displayString;
	}

	/**
	 * Updates the values maintained by the calculator based on the
	 * button that the user has just clicked.
	 * 
	 * @param text is the name of the button that the user has just clicked
	 */
	public void update(String text) {
		double temp = 0.0;
		double temp2 = 0.0;
		int i = 0;
		if (start) {	
			internalValue = displayValue;
			displayValue = 0;
			displayString = "";
			start = false;
			dot = false;
		}
		if (text.length() == 1 && "0123456789".indexOf(text) >= 0) {
			displayString += text;
			displayValue = Double.valueOf(displayString);
		} else if (text.equals(".")) {
			if (! dot) {	
				dot = true;	
				if (displayString.equals("")) {
					displayString = "0";
				}
				displayString += ".";
			}
		} else {
		    if (operation.equals("+")) {
				displayValue = internalValue + displayValue;
			} else if (operation.equals("-")) {
				displayValue = internalValue - displayValue;
			} else if (operation.equals("*")) {
				displayValue = internalValue * displayValue;
			} else if (operation.equals("/")) {
				displayValue = internalValue / displayValue;
			} else if (operation.equals("^")) {
				temp = displayValue;
				temp2 = internalValue;
				for(i = 0; i < temp - 1; i++){
				   internalValue *= temp2;
				}
				displayValue = internalValue;
			} else if (operation.equals("Clr")) {
				start = true;
			} else if (operation.equals("sqr root")) {
				displayValue = Math.sqrt(internalValue);
			} else if (operation.equals("ln")) {
				displayValue = Math.log(internalValue);
			} else if (operation.equals("log")) {
				displayValue = Math.log10(internalValue);
			} else if (operation.equals("%")) {
				displayValue = internalValue % displayValue;
			} else if (operation.equals("sin")) {
				displayValue = Math.sin(internalValue);
			} else if (operation.equals("cos")) {
				displayValue = Math.cos(internalValue);
			} else if (operation.equals("!")) {
				temp = 1;
				for(i = (int)internalValue; i > 0; i--){
				   temp *= i; 	
				}
				
				displayValue = temp;
			}
		    
			displayString = "" + displayValue;
			internalValue = displayValue;
			operation = text;
			start = true;
		}
	}
}
