package structures;

/**
 * A node of the circular list
 * @author augusticor
 * @param <T> generic type of the list, must be same as list type
 */
public class Node<T> {

	/**Information in the node*/
	protected T info;
	/**Next node to this*/
	protected Node<T> next;

	public Node(T info){
		this.info = info;
		this.next = null;
	}

	public Node(T info, Node<T> next) {
		this.info = info;
		this.next = next;
	}

	/**
	 * Sets the next node to this one, can be null if is the last element of the list
	 * @param next
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}	
}