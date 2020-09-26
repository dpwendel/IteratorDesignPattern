/*
 * Author: Douglas Wendel
 * The ToDoIterator is an iterator
 * class that declares variables and deals with 
 * the next information
 */
package iteratordesignpattern;
import java.util.Iterator;
public class ToDoIterator implements Iterator {
	private ToDo[] todos;
	private int position = 0;
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	public ToDo next() {
		ToDo toDo = todos[position];
		position = position +1;
		return toDo;	
	}
}
