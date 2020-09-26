/*
 * Author: Douglas Wendel
 * The ToDo class declares multiple variables, the array
 * and has the setters. it also returns price and the toString
 * that the program returns as a whole
 */
package iteratordesignpattern;
import java.util.ArrayList;
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies = new ArrayList<String>(); 
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;	
	}
	public double getPrice() { 
		return price;
	}
	public String toString() {
		String ret = "***** "+title+" *****"+"\n"+description + "\nBuisness Contact: "+contact+"\nSupply List:\n";
		for(String temp:supplies) {
			ret+="- "+temp+"\n";
		}
		ret+="Price: $"+price+"\n";
		return ret;
	} 
}
