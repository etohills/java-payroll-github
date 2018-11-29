/* 
 * This program calculationa paycheck amount
 *  Ethan O'Neill 11/27/18
 */

import java.text.*; 
import java.util.*;
public class BasicPayroll {

	
		// TODO Auto-generated method stub

		//why we have static.....all vars that have static is allocated to mememory right away
		// why use void prevents returning of values
	//Declare Variables	
		
		
		
		
		
		static String iString; //generic input string
		static String iFirstName, iLastName; //First and lastName 
		static int cHours; //Hours after conversion
		static double cRates; //rate after conversion
		static double cPay; //calculated pay
		static String oPay; //pay after formatting for currency display
		static Scanner myScanner; //input devices
		static NumberFormat nf; //used to format Currency: use a number class called NumberFormat...can rename it to anything
		
		public static void main (String[] args) {
			//call INIT() 
			init();
			
			//call input
			input();
			
			//call calculations()
			calcs();
		
			//call output
			output();
			
		
		System.out.println("Program ending, have a good one!");
		}
		
		public static void init () {
			//set scanner to the console 
			myScanner = new Scanner(System.in);
			//change delimiter from the blank space to enter key
			//To allow spaces in strings
			myScanner.useDelimiter(System.getProperty("line.separator"));
			
			//set formatter to use U.S currency format
			nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
			
			//THIS WILL STAY THE SAME WITH BASICALLY ALL PROJECTS!!
		}
	
		public static void input () {
			//prompt for first Name 
			System.out.print("Enter First Name: ");
			iFirstName = myScanner.next();
			
			//prompt for Last Name 
			System.out.print("Enter Last Name: ");
			iLastName = myScanner.next();
			
		
			
	
		
		try {	//prompt, input and convert hours
			System.out.print("Ener hours");
			iString = myScanner.next();
			cHours = Integer.parseInt(iString);
				}
			
			
			
		catch (Exception e) { 
			System.out.println("hours must be a whole number!!");
			cHours = 0;
		};
		
		try{	//prompt, input and convert rate
			System.out.print("Ener rate!");
			iString = myScanner.next();
			cRates = Double.parseDouble(iString);
			}
			
		catch(Exception e){ System.out.println("Rate must ne a decimal number, defaulted to 0!!");
		
			cRates = 0;
				}
		}
		public static void calcs () {
			//calculates
			cPay = cHours *cRates;
		}
		public static void output () {
			//display name as last, first
			System.out.println("Name: " + iLastName + "," + iFirstName);
			//format ad out pay
			oPay = nf.format(cPay);
			System.out.println("Pay is:" + oPay);
		}
}

