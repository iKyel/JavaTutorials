import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		// Using array
		String[] animals = {"cat","dog","rat","bird"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		System.out.println();
		//Using arraylist
		ArrayList<String> animals2 = new ArrayList<String>();
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");
		
		for(String i : animals2) {
			System.out.println(i);
		}
	}

}
