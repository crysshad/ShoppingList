import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import data.ShoppingItem;
import implemtation.ShoppingListImp;

public class test {

	public test() {
	}

	public static void main(String[] args) {

		ShoppingListImp sl = new ShoppingListImp();
		Map<String, List<ShoppingItem>> shoppingList = new HashMap<String, List<ShoppingItem>>();
		List<ShoppingItem> item = new ArrayList<ShoppingItem>();
		String key = "";

		System.out.println(sl.addItem("food", "watermelon"));
		System.out.println(sl.addItem("food", "strewberry"));
		System.out.println(sl.addItem("food", "banana"));
		System.out.println(sl.addItem("food", "watermelon"));
		System.out.println(sl.addItem("home", "chair"));
		System.out.println(sl.addItem("home", "table"));

		shoppingList = sl.retrieveShoppingList();
		/*System.out.println("Retrieve entire item list " + shoppingList);
		System.out.println("Retrieve food item list " + shoppingList.get("food"));
		System.out.println("Retrieve home item list " + shoppingList.get("home"));*/
		
		for (Entry<String, List<ShoppingItem>> entry : shoppingList.entrySet()) {
			
		/*	System.out.println(entry.getKey());
			System.out.println(entry.getValue());*/
			
			item = entry.getValue();
			for (ShoppingItem i : item) {
				System.out.println(i);
				
			}
			

		}
		
		/*System.out.println("Retrieve food item list " + sl.retrieveShoppingListByCategory("Food"));*/

	}

}
