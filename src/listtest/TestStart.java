package listtest;

import java.util.ArrayList;

public class TestStart {

	public static void main(String[] args){
		ListTester myLT = new ListTester();
		myLT.printList();
		myLT.addToList("tredje");
		myLT.changeStringAt(1, "andra");
		myLT.printList();
		ArrayList<String> myList;
		myList = myLT.getFlipped();
		for (String s: myList){
			System.out.println(s);
		}
	}
	
}
