package structures;

/**
 * Simply linked circular list data structure
 * @author augusticor
 * @param <T> generic type of the circular list
 */
public class CircularList<T> {

	/**The head or first element of the list*/
	protected Node<T> head;

	public CircularList() {
		head = null;
	}

	public CircularList(CircularList<T> circularList) {
		head = circularList.head;
	}

	/**
	 * Adds an element to the list
	 * @param info generic data to add
	 */
	public void addElement(T info) {
		if (head != null) {
			Node<T> aux = head;
			while (aux.next != head) {
				aux = aux.next;
			}
			aux.next = new Node<>(info, head);
		}
		else {
			head = new Node<>(info);
			head.setNext(head);
		}
	}
	
	/**
	 * Adds an element at the top of the list and becomes the new head
	 * @param info the new head of the list
	 */
	public void insertFirst(T info) {
		head = new Node<>(info, head);
	}

	/**
	 * Remove information from the list
	 * @param infoToRemove to search the element into the list
	 */
	public void remove(T infoToRemove) {
		Node<T> aux = head;
		while (aux.next.info != infoToRemove) {
			aux = aux.next;
		}
		Node<T> nextElement = aux.next;
		aux.next = nextElement.next;
	}
}