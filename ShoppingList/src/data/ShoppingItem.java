/**
 * 
 */
package data;


public class ShoppingItem {

	/**
	 * Creating shopping list object
	 */
	private String item;

	public ShoppingItem() {
		super();
		this.item = "";
	}
	
	public ShoppingItem(String item) {
		super();
		this.item = item;
	}

	public String toString(){
		String shoppingItem = item; 
		return shoppingItem;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}



}
