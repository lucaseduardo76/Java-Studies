package principioGetPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		copy(myInts, myObjs);
		
		System.out.println("Myints: " + myObjs);
		
	
		List<Double> myDoubles = Arrays.asList(3.14,6.28);
		copy(myDoubles, myObjs);

		System.out.println("MyDouble: " + myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> outSource){
		for(Number obj :  source) {
			outSource.add(obj);
		}
	}

}
