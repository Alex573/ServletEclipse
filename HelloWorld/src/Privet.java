import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Privet {

	public static void main(String[] args) {
	
		System.out.println("Hello");
		System.out.println("Pizdec");
		List<String> str = new ArrayList<>();
		List<Integer> inter = new LinkedList<>();
		System.out.println("A");
		System.out.println("Da ladno");
		
		for (int i = 0; i < 10; i++) {
			str.add("String"+i+1);
		}
		System.out.println(str+""+inter);
	}
	
}
