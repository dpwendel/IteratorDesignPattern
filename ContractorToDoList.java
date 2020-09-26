/*
 * Author: Douglas Wendel
 * The ContractorToDoList is one of the main classes in this program.
 * It Allows the user to add a toDo, get the address and total cost. 
 */
package iteratordesignpattern;
import java.util.ArrayList;
import java.util.Arrays;
public class ContractorToDoList {
	private String address;
	private ToDo[] todos; 
	private int count = 0; 
	public ContractorToDoList(String address) {
		this.address = address;
		todos = new ToDo[2];
		createIterator();
	}
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		if(todos.length == count) {
			todos=growArray(todos);
		}
		todos[count]= todo;
		count++;
	}
	public ToDoIterator createIterator() {
		ToDoIterator temp = new ToDoIterator(todos);
		return temp;
	}
	public String getAddress() {
		return address;	
	}
	public double getTotalCost() {
		double tCost = 0;
		for(int i = 0; i < todos.length; ++i) {
			if(todos[i]!=null)
				tCost += todos[i].getPrice();
		}
		return tCost;	
	}
	private ToDo[] growArray(ToDo[] todos) {
		todos = Arrays.copyOf(todos,count*2);
		return todos;	
	}
}
