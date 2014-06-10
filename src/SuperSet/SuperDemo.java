package SuperSet;

import java.util.ArrayList;
import java.util.Collections;

public class SuperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "ABDSersfew";
		ArrayList<SuperCharacter> chars = new ArrayList<SuperCharacter>();
		for (char c : s.toCharArray()) {
		  chars.add(new SuperCharacter(c));
		}
		
		Collections.sort(chars);
		
		for (SuperCharacter c : chars) {
			System.out.println(c.getChar());
		}

	}

}
