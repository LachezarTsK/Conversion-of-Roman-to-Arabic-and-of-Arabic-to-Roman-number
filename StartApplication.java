package conversionCalculator;

import conversionCalculator.UserInterface.UserInterface;

/**
 * Starts the application for conversion.
 * 
 * Unless stopped by the user, it will run continuously.
 * 
 * Valid input initiates the display of:
 * 
 * "input number = result of conversion"
 * 
 * 
 * Invalid input initiates the display of:
 * 
 * "Input can be only an Arabic or a Roman number.
 * 
 * Values: from 1 to 4999".
 * 
 * Leading zeros are allowed for Arabic numbers.
 * 
 * Roman numbers can be in lower or upper case.
 * 
 * Input can have leading or trailing space(s).
 * 
 * @author Lachezar Kutsarov
 */
public class StartApplication {

	public static void main(String[] args) throws Exception {
		UserInterface startApplication = new UserInterface();
		startApplication.conversionCalculator();
	}
}
