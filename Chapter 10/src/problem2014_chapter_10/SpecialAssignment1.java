package problem2014_chapter_10;

/* THIS IS A VERY LENGTHY ASSIGNMENT AND WILL TAKE YOU A SIGNIFICANT AMOUNT OF TIME.
 * DO NOT WAIT UNTIL THERE ARE ONLY 3 OR 4 DAYS LEFT TO WORK ON IT!!!
 * THE GRADING WILL BE VERY STRICT. 
 * 
 * PART OF THE GRADING (DISCRETION POINTS) MAY TEND TO BE SLIGHLY SUBJECTIVE...
 * THAT MEANS BE THOROUGH AND WHEN YOU ARE IN DOUBT ABOUT INLCUDING OR DOCUMENTING - 
 * JUST DO IT! YOUR CODE NEEDS TO BE EASY FOR ME TO FOLLOW. PLEASE MAKE SURE YOU 
 * READ THE REQUIREMENTS AND UNDERSTAND THEM. 
 * 
 * A DISCUSSION TOPIC HAS BEEN PROVIDED ON THE FUSION PAGE WHERE YOU CAN SUBMIT COMMENTS.
 * AND QUESTIONS. I WILL TRY TO MODERATE THE PAGE AT LEAST ONCE A DAY. ON THE FUSION PAGE 
 * YOU WILL ALSO FIND A SCORING RUBRIC WHICH I WILL USE AND YOU CAN ALSO TO EVALUATE 
 * YOURSELF. PLEASE SUBMIT IT IN THE .ZIP FILE EACH TIME YOU SUBMIT YOUR CODE. 
 * 
 * THERE IS AN EXAMPLE OF A FILE WITH 52 TRANSACTIONS ON THE FUSION PAGE (transactions4.dat). 
 * IF YOU ARE UNSURE ABOUT THE RESULTS FROM ANY TRANSACTION FILE, SUBMIT IT TO ME 
 * AND ASK ME TO RUN IT WITH THE SOFTWARE I HAVE CREATED. I WILL THEN PROVIDE THE 
 * RESULTS TO YOU AND THE REST OF THE CLASS. 
 * 
 * THE ASSIGNMENT WILL BE GRADED ON THE CURVE.
 ********************************************************************************************************* 
 * Problem #1 RewardCustomer
 * A supermarket wants to reward its best customer of each day, showing the 
 * customerís name on a screen in the supermarket. For that purpose, 
 * the customerís purchase amount is stored in an ArrayList<Double> and the 
 * customerís name is stored in a corresponding ArrayList<String>.
 * 
 * Implement a method
 * 		public static String nameOfBestCustomer(ArrayList<Double> purchases,
 * 			ArrayList<String> customers)
 * that returns the name of the customer with the largest number of purchases in $.
 * Write a program that prompts the cashier for a file name which contains a record 
 * of transactions (purchase, customer name). Your program should read in the 
 * transactions and then implement the method above. Note that the transactions are in random 
 * order.
 * 
 * The data are stored in a file named transactions1.dat and transactions2.dat, however the
 * second file is empty. 
 *********************************************************************************************************  
 * Problem #2 ProcessTransactionFile
 * You must write a method that will create the file transactions2.dat. Inputs to the
 * process of creating the file should be a file name and number of transactions (a positive
 * number). The format of the file is the same as transactions1.dat. A double followed by
 * a customer name. The double (purchase) must be randomly generated. The customer name must be a 
 * single upper or lower case alphabetic letter and it should also be randomly generated.
 * 
 * If the file contains less than 52 transactions, then the customers names must be unique.
 * You must generate the file during execution and are prohibited from saving any 
 * part of the transactions (that means purchase or name) in any method before execution begins.
 * 
 * You must be able to generate files with 0, 26, 52, 53 and 100 transactions. Any file with
 * less than 53 transactions must have unique names. Software must be provided to print 
 * the file and to query the file for printouts which should contain appropriate statistics 
 * for the name(s). 
 * Hint: http://www.ascii-code.com/.
 *********************************************************************************************************  
 * Problem #3 TopCustomer
 * Improve Problem 1 so that it displays the top customers, that is, 
 * the topN customers with the largest purchases, where topN(>0) is a 
 * value that the user of the program supplies. The customers should be
 * displayed using the largest purchases first and so on.
 * 
 * Implement a method
 * 		public static ArrayList<String> nameOfBestCustomers(ArrayList<Double> purchases, 
 *  		ArrayList<String> names, int topN)
 * If there were fewer than topN customers, include all of them.
 *********************************************************************************************************  
 * Problem #4 UpdateStats
 * As you are working on these problems you must update a file which contains the date 
 * you worked on the problem, the problem number and the number of minutes you spent 
 * working on the problem on that particular day. The file may be updated manually
 * and you should provide software which provides printouts of the dates and number 
 * of minutes that you worked on any problem and the total minutes. The file should be 
 * named stats.dat. You will not be graded on the amount of time you spend on this 
 * assignment.
 *********************************************************************************************************  
 * Extra Credit #1
 * a. There are a number of menus in this assignment. Extra credit (5 pts) for using a class
 * which takes care of all the details of printing, selection, etc. You must implement
 * the interface AMenu. Hint: Figure out how to use a constructor with a variable 
 * number of arguments. 
 * b. A scanner can be set up that allow it to parse a line with different
 * delimiters . Extra credit (2 pts) for being able to create and read transaction
 * files with both a space and comma as the delimiting character. transactions3.dat is an
 * example.
 *********************************************************************************************************  
 * Additional requirements:
 * 		1. You must use the for-each statement wherever possible.
 * 		2. You must put your program in an infinite loop and you must provide
 * 		   a programmatic means to terminate the loop.
 * 		3. At the end of each day that you work on the assignment you should submit 
 * 		   a .zip file as called out in #4 below. You will not be graded on 
 * 		   intermediate submittals.       
 *      4. The submittal for this assignment should be a .zip file with the
 *         program, the stats.dat file and a filled out rubric. You may chose to use 
 *         your own defined classes for any of the problems. In that case you must 
 *         also submit those files.
 *      4. ****WARNING:**** THE USER (ME) IS NOT VERY COMPUTER LITERATE. I HAVE A TENDENCY
 *         TO ENTER DATA INCORRECTLY. YOU MUST TAKE ACCOUNT OF THIS IN YOUR CODE.
 *      5. THE ASSIGNMENT IS DUE BEFORE 11:59PM ON 5/25/14. NO LATE ASSIGNEMTS ACCEPTED.!
 *********************************************************************************************************  
 * Clarifications:
 * 		1. You must receive a score of at most 6 points lower than the highest score
 *         in order to receive any extra credit.
 * 	    2. transactions1.dat should not be changed. It does not adhere to the requirements
 * 	       for transactions2.dat on purpose.
 * 	    3. Number of lines of code. 
 * 		   Don't include blank lines, declarations, lines which contain only an 
 * 		   else statement, break statements, continue statements,
 * 		   return statements, and lines with only brackets as a line of code. 
 * 		   A line of code continued on another line only counts as one line of code.
 * 		4. You may not use any other type of collection (linked list, set, map, queue, 
 * 		   etc.) in your solution. 
 *********************************************************************************************************  
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import problem2014_chapter_10.Menu;

public class SpecialAssignment1 {
	private static ArrayList<String> names2 = new ArrayList<String>();
	private static ArrayList<Double> sales2 = new ArrayList<Double>();
	private static ArrayList<String> names3 = new ArrayList<String>();
	private static ArrayList<Double> sales3 = new ArrayList<Double>();

	public static void main(String[] args) throws IOException {
		firstSelection();

		// System.out.println(getWinners());

	}

	public static String getFile() throws IOException {
		System.out.println("Please enter the name of the text file: ");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[, //s]");
		String name = sc.nextLine();
		try {
			Scanner sc2 = new Scanner(new File(name));
			return name;
		} catch (FileNotFoundException e) {
			System.err.println("the file could not be found");
			main(null);
		}
		return null;
	}

	public static void changeArrayLists(Scanner sc) {
		while (sc.hasNextLine()) {
			sales2.add(sc.nextDouble());
			String temp = sc.next();
			names2.add(Character.toString(temp.charAt(temp.length() - 1)));

		}
		combineEntries();
	}

	public static void processTransactionFile(int num) throws IOException {
		ArrayList<Character> al = new ArrayList<Character>();
		ArrayList<Double> al2 = new ArrayList<Double>();
		ArrayList<Character> al3 = new ArrayList<Character>();
		Random r = new Random();
		for (int i = 65; i < 91; i++) {
			al.add((char) i);
			al.add((Character.toString((char) i).toLowerCase()).charAt(0));
		}

		for (int i = 0; i < num-1; i++) {
			int temp = r.nextInt(al.size());
			if (num < 53) {
				al.remove(temp);
			}
			al3.add(al.get(temp));
			double s = ((double) (r.nextInt(10000)) / 100);
			al2.add(s);
		}
		write(al2,al3,num);
	}

	public static void write(ArrayList<Double> al2, ArrayList<Character> al3,
			int num) throws IOException {
		PrintStream bw = new PrintStream("transblactions2.dat");
	System.out.println(al3.size()+" "+al2.size());
		for (int i = 0; i < num-1; i++) {
			bw.print(al3.get(i) + " " + al2.get(i)+"\n");
		}
	}

	public static String getWinners(ArrayList<Double> purchases,
			ArrayList<String> customers) throws IOException {
		double cur = 0.0;
		int loc = -1, curloc = 0;
		// loc = 0;
		curloc = 0;
		for (Double d : sales3) {
			if (d > cur || loc == -1) {
				loc = curloc;
				cur = d;
			}
			curloc++;
		}
		if (loc != -1)
			return names3.get(loc);
		else {
			System.out.println("There were no names in this file");
			main(null);
			return null;
		}
	}

	public static ArrayList<String> nameOfBestCustomers(
			ArrayList<Double> purchases, ArrayList<String> customers, int topN)
			throws IOException {
		ArrayList<String> winners = new ArrayList<String>();
		if (sales3.size() <= topN) {
			return names3;
		}
		for (int i = 0; i < topN; i++) {
			String temp = getWinners(sales3, names3);
			System.out.println(temp);
			winners.add(temp);
			int u = names3.indexOf(temp);
			sales3.remove(u);
			names3.remove(u);

		}

		return winners;
	}

	public static void combineEntries() {

		for (int u = 0; u < names2.size(); u++) {
			boolean checked = false;
			for (int i = u; i < sales2.size(); i++) {
				if (names2.get(u).equals(names2.get(i)) && u != i) {
					sales3.add(sales2.get(u) + sales2.get(i));
					names3.add(names2.get(i));
					sales2.remove(u);
					sales2.remove(i);
					names2.remove(u);
					names2.remove(i);
					checked = true;
				}

			}
			if (!checked) {
				names3.add(names2.get(u));
				sales3.add(sales2.get(u));
			}

		}

	}

	public static void firstSelection() throws IOException {
		Menu menu = new Menu("Run top customer", "Run topN customers",
				"query stats file", "Write to file");
		int h = menu.printMenuGetSelection();
		switch (h) {
		case 1:
			secondSelection(false);
			break;
		case 2:
			secondSelection(true);
			break;
		
		case 4:
			thirdSelection();
	}
	}

	public static void secondSelection(boolean w) throws IOException {
		System.out.println("What file would you like to use: \n");
		Menu menu = new Menu("Transactions1.txt",
				"Transactions3.txt (Uses Delimeter)", "Transactions4.txt",
				"Custom File");
		int x = menu.printMenuGetSelection();
		String nameOfFile = "";
		switch (x) {
		case 1:
			nameOfFile = "transactions1.dat";
			break;
		case 2:
			nameOfFile = "transactions3.dat";
			break;
		case 3:
			nameOfFile = "transactions4.dat";
			break;
		case 4:
			nameOfFile = getFile();
		}
		Scanner sc2 = new Scanner(new File(nameOfFile));
		changeArrayLists(sc2);
		if (w) {
			Scanner sc = new Scanner(System.in);
			System.out.println("How many top values would you like?");
			int top = sc.nextInt();
			System.out.println("The winners are: "
					+ nameOfBestCustomers(sales2, names2, top));

		} else {
			System.out.println("The winner is " + getWinners(sales2, names2));
		}
	}

	public static void thirdSelection() throws IOException {
		System.out.println("How many entries would you like to generate?");
		Menu menu = new Menu("0", "26", "52", "53", "100", "Custom Number");
		int i = menu.printMenuGetSelection();
		int num = 0;
		Scanner sc = new Scanner(System.in);
		switch (i) {
		case 2:
			num = 27;
			break;
		case 3:
			num = 53;
			break;
		case 4:
			num = 54;
			break;
		case 5:
			num = 101;
			break;
		case 6:
			System.out.println("How many entries would you like?");
			num = sc.nextInt()+1;
		}
		processTransactionFile(num);
		System.out.println("File has been written");
	}
	
}
