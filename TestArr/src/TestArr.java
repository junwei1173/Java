import java.util.*;
public class TestArr {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("one", "two", "three", "four"));
		System.out.println(list);
		
		for (int i = 0; i<list.size();i+=2) {
			
			list.add(i,"+");
			
		}
		System.out.println(list);

	}

}
