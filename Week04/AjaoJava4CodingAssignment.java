/* Author: Samuel Ajao
 * Course: Promineo Tech Back End Software Development Boot Camp
 * Assignment: Java 4 Coding Project
 * Date: May 13, 2024
 */
package Week04;


public class AjaoJava4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 * a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		 * 		(i.e. do not use ages[7] in your code). Print the result to the console.  
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		 * i. Make sure that there are 9 elements of type int in this new array.  
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		 * iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		 * c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //1. Create an array of int called ages that...
		
		System.out.println(ages[ages.length-1] - ages[0]); //a.Programmatically subtract the value...Print the result to the console.
		
		int[] ages2 = new int[9]; //b. Create a new array of int called ages2...
		int index2 = ages2.length -1;
		
		System.out.println("Size of ages2 is: " + ages2.length); //i. Make sure that there are 9 elements of type int in this new array.
		for(int i = 0; i <= ages2.length -1; i++) {
			ages2[i] = 5 * (i+2); 
		}
		
		for(int i : ages2) {
			System.out.println(i);
		}
		
		
		System.out.print("Subtracting the first ages2 indexed item from the last yields: ");
		System.out.println(ages2[ages2.length -1] - ages2[0]); //ii. Repeat the subtraction from Step 1.a
		
		int[] ages3 = {5,10,20,40,80}; //iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		System.out.print("Subtracting the first ages3 indexed item from the last yields: ");
		System.out.println(ages2[ages3.length -1] - ages3[0]);
		
		int sumAge = 0; //c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		for(int a : ages2) {
			sumAge += a;
		}
		
		System.out.println("The average age in ages2 is: " + sumAge/ages2.length);
		
		
		
		
		/*
		 * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * 	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 * 	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //2. Create an array of String called names that...
		int nameLens = 0;
		
		for(String n : names) { // a. Use a loop to iterate through the array and...
			nameLens += n.length();
		}
		
		double avgNameLens = (double)nameLens/(double)names.length; //...calculate the average number of letters per name...
		System.out.println("The calculated average name length is: " + String.format("%.3f", avgNameLens)); //Print the result to the console.
		
		
		String concatNames = "";
		
		for(int i=0; i<= names.length-1; i++) { //b. Use a loop to iterate through the array again...
			concatNames += names[i]; //...and concatenate all the names together,...
			if(i < names.length-1) {
				concatNames += " "; //...separated by spaces, and...
			}
		}
		System.out.println(concatNames); //...print the result to the console.
		
		
		
		

	} //End of Main

} // End of Class
