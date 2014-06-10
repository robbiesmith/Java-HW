package problem2014_chapter_10;

public interface AMenu {
	/**
	 * Prints a menu with selections and logic to return a valid selection.
	 * @return the selected item
	 */
	abstract int printMenuGetSelection();
	
	 /**
	 * @return the numberOfMenuItems
	 */
	abstract int getNumberOfMenuItems();
}
