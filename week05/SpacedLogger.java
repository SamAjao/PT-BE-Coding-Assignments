/*
* Author    : Samuel Ajao
* Course    : Promineo Tech Back End Software Development Boot Camp
* Assignment: Java Week 05 Coding Project
* Date      : May 23, 2024
* 
*           : SpacedLogger Class that implements Logger Interface
*/

package week05;


public class SpacedLogger implements Logger{

	
	/*
	 * a. If the log method received “Hello” as an argument, it should print H e l l o
	 */
	@Override
	public void log(String info) {

		spaceWord(info);
		
	}

	
	/*
	 * b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	 */
	@Override
	public void error(String info) {

		System.out.print("ERROR: ");
		spaceWord(info);
		
	}
	
	
	public void spaceWord(String aWord) {
		
		int numSpaces = aWord.length();
		
		for(int i = 0; i < numSpaces; i++) {
			System.out.print(aWord.charAt(i));
			System.out.print(" ");
		}
		System.out.println();
		
	}

}// End of SpacedLogger Class
