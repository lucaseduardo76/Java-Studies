package program;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> myInts = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			myInts.add(i);
		}
		printList(myInts);
		
		List<String> myStr = new ArrayList<>();
		myStr.add("Teste");
		myStr.add("ABC");
		printList(myStr);		
		
	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
