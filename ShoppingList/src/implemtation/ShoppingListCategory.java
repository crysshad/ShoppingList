/**
 * 
 */
package implemtation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import data.ShoppingItem;

/**
 * @author Jing
 *
 */
public class ShoppingListCategory {

	/**
	 * Create categories
	 */

	private static List<ShoppingItem> foodItemList;
	private static List<ShoppingItem> homeItemList;
	private static Logger logger = LogManager.getLogger(ShoppingListCategory.class);

	public enum shoppingListCategory {
		FOOD, HOME

	}

	public void createItemList() {
		if (foodItemList == null) {
			foodItemList = new ArrayList<ShoppingItem>();
			logger.debug("creates a new foodItemList ArrayList");
		}

		else if (homeItemList == null) {
			homeItemList = new ArrayList<ShoppingItem>();
			logger.debug("creates a new homeItemList ArrayList");
		}
	}

	public static List<ShoppingItem> getItemList(String category, ShoppingItem item) {

		if (category == "food") {
			return getFoodItemList();
		}

		else if (category == "home") {
			return getHomeItemList();
		}

		else {
			return getFoodItemList();
		}

	}

	public static List<ShoppingItem> getFoodItemList() {
		return foodItemList;
	}

	public static void setFoodItemList(List<ShoppingItem> foodItemList) {
		ShoppingListCategory.foodItemList = foodItemList;
	}

	public static List<ShoppingItem> getHomeItemList() {
		return homeItemList;
	}

	public static void setHomeItemList(List<ShoppingItem> homeItemList) {
		ShoppingListCategory.homeItemList = homeItemList;
	}

}
