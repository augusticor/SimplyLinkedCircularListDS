package structures;

/**
 * Cursor of the circular list
 * @author augusticor
 * @param <T> generic type of the cursor, same of the circular list
 */
public class Cursor<T> extends CircularList<T> {

	/**The cursor to go trough the list*/
	private Node<T> cursor;

	public Cursor(CircularList<T> circularList) {
		super(circularList);
		cursor = head;
	}

	/**
	 * @return if the cursor is out of the list
	 */
	public boolean isOut() {
		return (cursor.next == null);
	}

	/**
	 * Sets the cursor at the head of the list
	 */
	public void reset() {
		cursor = this.head;
	}

	/**
	 * @return the info on the node where the cursor goes
	 */
	public T getInfo() {
		return cursor.info;
	}

	/**
	 * Sets the cursor one position ahead from current position
	 */
	public void next() {
		cursor = cursor.next;
	}

	/**
	 * @return the information from the next node of the list
	 */
	public T nextInfo() {
		T aux = cursor.info;
		cursor = cursor.next;
		return aux;
	}
}