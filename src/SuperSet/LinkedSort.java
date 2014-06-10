package SuperSet;

import java.util.List;
import java.util.Arrays;

public class LinkedSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> myStrings = Arrays.asList("apple","carrot","pear","banana");
		List<Integer> myInts = Arrays.asList(new Integer(6),new Integer(44),new Integer(11),new Integer(1));
		
		sortLinked(myStrings,myInts, true, true);
		sortLinked(myStrings,myInts, true, false);
		sortLinked(myStrings,myInts, false, true);
		sortLinked(myStrings,myInts, false, false);

	}
	
	private static void sortLinked( List<String> stringArray, List<Integer> intArray, boolean useNumbers, boolean reverse) {
		if (stringArray.size() != intArray.size()) {
			return;
		}

		String[] outStrings = new String[stringArray.size()];
		stringArray.toArray(outStrings);
		Integer[] outInts = new Integer[intArray.size()];
		intArray.toArray(outInts);

		for ( int i = 0; i < stringArray.size(); i++ ) {
			for ( int j = i + 1; j < stringArray.size(); j++ ) {
				if ( useNumbers ) {
					if ( outInts[i].compareTo(outInts[j]) > 0 != reverse) {
						String tempString = outStrings[i];
						Integer tempInt = outInts[i];
						outStrings[i] = outStrings[j];
						outInts[i] = outInts[j];
						outStrings[j] = tempString;
						outInts[j] = tempInt;
					}
				} else {
					if ( outStrings[i].compareTo(outStrings[j]) > 0 != reverse) {
						String tempString = outStrings[i];
						Integer tempInt = outInts[i];
						outStrings[i] = outStrings[j];
						outInts[i] = outInts[j];
						outStrings[j] = tempString;
						outInts[j] = tempInt;
					}
				}
			}
		}
		
		stringArray = Arrays.asList(outStrings);
		intArray = Arrays.asList(outInts);

		for ( int i = 0; i < stringArray.size(); i++ ) {
			System.out.print(intArray.get(i));
			System.out.println(stringArray.get(i));
		}
	}

	private static void sortLinkedByStringsReverse( List<String> stringArray, List<Integer> intArray) {
		if (stringArray.size() != intArray.size()) {
			return;
		}

		String[] outStrings = new String[stringArray.size()];
		stringArray.toArray(outStrings);
		Integer[] outInts = new Integer[intArray.size()];
		intArray.toArray(outInts);

		for ( int i = 0; i < stringArray.size(); i++ ) {
			for ( int j = i + 1; j < stringArray.size(); j++ ) {
				if ( outStrings[i].compareTo(outStrings[j]) < 0) {
					String tempString = outStrings[i];
					Integer tempInt = outInts[i];
					outStrings[i] = outStrings[j];
					outInts[i] = outInts[j];
					outStrings[j] = tempString;
					outInts[j] = tempInt;
				}
			}
		}
		
		stringArray = Arrays.asList(outStrings);
		intArray = Arrays.asList(outInts);

		for ( int i = 0; i < stringArray.size(); i++ ) {
			System.out.print(intArray.get(i));
			System.out.println(stringArray.get(i));
		}
	}

}
