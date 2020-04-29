package tests;

import structures.CircularList;
import structures.Cursor;

/**
 * Simply linked circular list data structure in Java
 * Used I.D.E: Eclipse
 * @author augusticor
 * @category data structures
 */
public class TestCircularList {

	public static void main(String[] args) {
		CircularList<Integer> circularList = new CircularList<>();

		circularList.addElement(9);
		circularList.addElement(2);
		circularList.addElement(3);
		circularList.addElement(6);
		circularList.addElement(1);
		circularList.addElement(7);
		circularList.addElement(8);
		circularList.addElement(11);
		circularList.addElement(15);
		circularList.addElement(5);

		Cursor<Integer> cursor = new Cursor<>(circularList);

		circularList.remove(2);
		System.out.println("\n");

		while (!cursor.isOut()) {
			System.out.println(cursor.nextInfo());
		}
	}
}