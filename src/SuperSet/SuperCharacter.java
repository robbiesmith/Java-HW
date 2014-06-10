package SuperSet;

import java.util.ArrayList;

public class SuperCharacter implements Comparable<SuperCharacter> {
	private Character c;

	public SuperCharacter(char ch) {
		c = new Character(ch);
	}
	
	public char getChar() {
		return c.charValue();
	}
	
	public Character getCharacter() {
		return c;
	}
	
    public int compareTo(SuperCharacter o) {
        if (Character.toLowerCase(o.getChar()) == Character.toLowerCase(c.charValue())) {
        	if ( o.getChar() == c.charValue() ) {
        		return 0;
        	}
            else if (o.getChar() < c.charValue()) {
                return 1;
            }
            else {
                return -1;
            }
        }
        else if (Character.toLowerCase(o.getChar()) < Character.toLowerCase(c.charValue())) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
