/*
* Author    : Samuel Ajao
* Course    : Promineo Tech Back End Software Development Boot Camp
* Assignment: Java Week 05 Coding Project
* Date      : May 23, 2024
* 
*           : App Class that holds main method for testing the Logger interface
*/

package week05;

public class App {

	public static void main(String[] args) {
		
		Logger spacedLogger = new SpacedLogger();
		Logger asteriskLogger = new AsteriskLogger();
		
		spacedLogger.log("Hello");
		spacedLogger.log("Goodbye");
		spacedLogger.error("Bye");
		
		asteriskLogger.log("Hello");
		asteriskLogger.log("Goodbye");
		asteriskLogger.error("Goodbye");

	}

}
