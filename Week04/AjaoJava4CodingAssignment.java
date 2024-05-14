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
		
		int sumAge = 0; //c. Use a loop to iterate through the array and calculate the average age. ...
		for(int a : ages2) {
			sumAge += a;
		}
		
		System.out.println("The average age in ages2 is: " + sumAge/ages2.length); //...Print the result to the console.
		
		
		
		
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
		
		
		
		/*
		 * 3. How do you access the last element of any array?
		 * lastElement = arr[arr.length - 1];
		 */
		
		/*
		 * 4. How do you access the first element of any array?
		 * firstElement = arr[0];
		 */
		
		
		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously
		 *  	created names array and add the length of each name to the nameLengths array.
		 */
		int[] nameLengths = new int[names.length]; //Create a new array of int called nameLengths
		
		for(int i = 0; i < names.length; i++) { //Write a loop to iterate over the previously created names array...
			
			nameLengths[i] = names[i].length(); //...and add the length of each name to the nameLengths array.
		}
		
		
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 */
		int sumNameLengths = 0;
		
		for(int i : nameLengths) { //Write a loop to iterate over the nameLengths array...
			sumNameLengths += i; //and calculate the sum of all the elements in the array.
		}
		
		System.out.println("The sum of the nameLengths is: " +sumNameLengths); //Print the result to the console.
		
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word
		 * concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method
		 *  to return “HelloHelloHello”)
		 */		
		System.out.println(returnWordRepeated("Hello",3)); //if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”)
		
		
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full
		 *  name should be the first and the last name as a String separated by a space).
		 */
		System.out.println(returnFullName("Lisa", "Turner"));
		
		
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
		
		System.out.println(returnGreaterThan100(ages));
		int[] sumUnder100 = {33, 33, 33};
		System.out.println(returnGreaterThan100(sumUnder100));
		
		/*
		 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 */
		double[] dblArr = {1.0, 2.0, 4.0, 5.0, 6.0, 7.0};
		System.out.println(returnArrayAvg(dblArr));
		

	} //End of Main
	
	//--------METHODS BEGIN----------------------------------METHODS BEGIN--------------------------------METHODS BEGIN------------------------
	
	public static String returnWordRepeated(String word, int n) { //7. Write a method that takes a String, word, and an int, n, as arguments...
		StringBuilder wordRepeat = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			wordRepeat.append(word);
		}
		
		return wordRepeat.toString(); //...and returns the word concatenated to itself n number of times.
		
	}
	
	
	public static String returnFullName(String fName, String lName) { //8. Write a method that takes two Strings, firstName and lastName,...
		StringBuilder fullName = new StringBuilder();
		
		fullName.append(fName);
		fullName.append(" "); //first and the last name as a String separated by a space).
		fullName.append(lName);
		
		return fullName.toString(); //...and returns a full name (the full name should be the 
	}
	
	public static boolean returnGreaterThan100(int[] anArray) { //9. Write a method that takes an array of int and...
		int sum = 0;
		int arrIndex = anArray.length-1;
		boolean isOver100 = false;
		
		for(int i = 0; i<=arrIndex; i++) {
			sum += anArray[i];
			//System.out.println(anArray[i]);
		}
		
		if(sum>100) {
			return true; //...returns true if the sum of all the ints in the array is greater than 100.
		}
		else {
			return false;
		}
		
	}
	
	
	public static double returnArrayAvg(double[] dblArr) { //10. Write a method that takes an array of double...
		double sum = 0;
		
		for(double d : dblArr) {
			sum += d;
		}
		
		return sum/dblArr.length; //and returns the average of all the elements in the array.
	}
	

} // End of Class
