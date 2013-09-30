package listtest;

import java.util.ArrayList;

public class ListTester {
	
	private ArrayList<String> al;
	
	public ListTester(){
		// initialize list
		al = new ArrayList<String>();
		// start out with 2 strings
		al.add("first");
		al.add("second");
	}

	public void addToList(String str){
		al.add(str);
	}
	
	public void changeStringAt(int pos, String str){
		al.set(pos,str);
	}
	
	public void printList(){
		for (String s: al){
			System.out.println(s);
		}
	}
	
	public ArrayList<String> getFlipped(){
		ArrayList<String> flip = new ArrayList<String>();
		int s = al.size();
		while (s > 0){
			s--;
			flip.add(al.get(s));
		}
		return flip;
	}
	
}
