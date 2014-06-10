package problem2014_chapter_10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu implements AMenu {
	public ArrayList<String> options = new ArrayList<String>();

	public Menu(String... items) {
		for (String s : items) {
			options.add(s);
		}
	}

	@SuppressWarnings("resource")
	@Override
	public int printMenuGetSelection() {
		for (int i = 1; i < options.size() + 1; i++) {
			System.out.println(i + ". " + options.get(i - 1));
		}
		System.out.println("Enter a valid selection: ");
		Scanner sc = new Scanner(System.in);
		try {
			int o=sc.nextInt();
			if (o - 1 <= getNumberOfMenuItems()) {
				return o;
			} else {java.awt.Toolkit.getDefaultToolkit().beep();
				System.out.println("That is not a valid selection.\nPlease enter a number in the correct range");
				printMenuGetSelection();
				return 0;
			}
		} catch (InputMismatchException e) {
			System.err
					.println("The characters you entered were not legal. Please enter a number");
			printMenuGetSelection();
			return 0;
		}
	}

	@Override
	public int getNumberOfMenuItems() {
		return options.size();
	}

}
