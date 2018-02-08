/**
 * 
 */
package implemtation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import data.ShoppingItem;

public class ShoppingListCategory {

	/**
	 * Categories and list
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
			logger.debug("created a new foodItemList ArrayList");
		}

		else if (homeItemList == null) {
			homeItemList = new ArrayList<ShoppingItem>();
			logger.debug("created a new homeItemList ArrayList");
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
