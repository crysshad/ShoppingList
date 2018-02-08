package interfaceP;

import java.util.List;
import java.util.Map;

import data.ShoppingItem;

public interface ShoppingList {
	
	public StringBuilder addItem(String category, String item);
	public Map<String, List<ShoppingItem>> retrieveShoppingList();
	public List<ShoppingItem> retrieveShoppingListByCategory(String category);

}
