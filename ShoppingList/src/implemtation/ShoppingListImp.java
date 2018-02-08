/**
 * 
 */
package implemtation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import data.ShoppingItem;
import interfaceP.ShoppingList;

/**
 * @author Jing
 *
 */
public class ShoppingListImp extends ShoppingListCategory implements ShoppingList {

	/**
	 * Implementation
	 */

	private StringBuilder message;
	private static ShoppingItem item;
	private static Map<String, List<ShoppingItem>> shoppingList;
	private static Logger logger = LogManager.getLogger(ShoppingListImp.class);

	public ShoppingListImp() {
		super();
		this.message = null;
	}

	@Override
	public StringBuilder addItem(String category, String newItem) {

		category = category.toUpperCase();
		newItem = newItem.toLowerCase();

		// Convert String category to Enum for comparison later
		shoppingListCategory categoryEnum = shoppingListCategory.valueOf(category);

		createItemList(); // Create shopping list by category
		item = new ShoppingItem(); // Create a new shopping item object
		item.setItem(newItem);

		if (shoppingList == null) {
			shoppingList = new HashMap<String, List<ShoppingItem>>();
			logger.debug("creates a new shoppingList hashMap");
		}

		if (newItem.trim().length() > 0) {
			if (categoryEnum == shoppingListCategory.FOOD) {
				getFoodItemList().add(item);
				shoppingList.put("FOOD", getFoodItemList());
				logger.debug("new item is added to the food list");

			} else if (categoryEnum == shoppingListCategory.HOME) {
				getHomeItemList().add(item);
				shoppingList.put("HOME", getHomeItemList());
				logger.debug("new item is added to the home list");
			}

		} else {
			newItem = "Nothing";
		}

		message = new StringBuilder();
		message.append(newItem).append(" has been added to ").append(category).append(" category of the shopping List");

		return message;
	}

	@Override
	public Map<String, List<ShoppingItem>> retrieveShoppingList() {

		return shoppingList;
	}

	@Override
	public List<ShoppingItem> retrieveShoppingListByCategory(String category) {

		category = category.toUpperCase();
		List<ShoppingItem> itemList = new ArrayList<ShoppingItem>();
		if (shoppingList.containsKey(category)) {

			itemList = retrieveShoppingList().get(category);

		}

		return itemList;
	}

}
