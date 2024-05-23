/*
* Author    : Samuel Ajao
* Course    : Promineo Tech Back End Software Development Boot Camp
* Assignment: Java Week 05 Coding Project
* Date      : May 23, 2024
* 
*           : Asterisk Logger Class that implements Logger Interface
*/

package week05;


public class AsteriskLogger implements Logger{

	/*
	 * a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of 
	 * 		the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
	 */	
	@Override
	public void log(String info) {

		System.out.println("***" + info + "***");
		
	}

	
	/*
	 * b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
	 *  with the String preceded by the word “ERROR:”.
	 *  
	 */		
	@Override
	public void error(String info) {
		
		int numAster = info.length() +13;
		printAsterisks(numAster);
		System.out.println("***Error: " + info + "***");
		printAsterisks(numAster);
		
	}
	
	
	public void printAsterisks(int printAste) {
		
		for(int i = 0; i < printAste; i++) {
			System.out.print("*");
		}
		System.out.println();

	}



} //End of AsteriskLogger Class
