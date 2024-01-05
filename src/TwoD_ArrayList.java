import java.util.ArrayList;

public class TwoD_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		// System.out.println(bakeryList);
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zuchini");
		produceList.add("pepper");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("soda");
		drinkList.add("coffee");
		
		// System.out.println(drinkList);
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));
		
	}

}
