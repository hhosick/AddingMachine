package cse360assign2;

/* @author Hunter Hosick
 * CLASS ID: (70641) CSE360 9:40am-10:30am 
 * ASSIGNMENT 2
 * DESCRIPTION: This class is designed to add and subtract values
 * 				given in the parameters of the functions, then upon
 * 				request, get the total of the all the operations that
 * 				occurred during the process. Additionally, the string should
 * 				be the history of all the processes that occurred with the
 * 				operation sign and the corresponding value.
 */

public class AddingMachine 
{
	private int total;
	private String history;
	
	//Constructor of AddingMachine, used to set the total to 0 and history to "0" when the class is
	//initalized
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	
	/*
	 * Gets the total from all the operations that occurred
	 * 
	 * @return total the integer value of the sums and difference of all values
	 */
	public int getTotal () 
	{
		return total;
	}
	
	
	/*
	 * Adds the value given to the total of the process and puts the operation
	 * and value in to the history
	 * 
	 * @param value the integer value to add to the total
	 */
	
	public void add (int value) 
	{
		total += value;
		history = history + " + " + value;
	}
	
	
	/*
	 * Subtracts the value given from the total of the process and puts the
	 * operation and value into history
	 * 
	 * @param value the integer value to subtract from the total
	 */
	public void subtract (int value) 
	{
		total -= value;
		history = history + " - " + value;
	}
	
	
	/*
	 * Provides the history of the operations with the corresponding
	 * value that makes up the total of the process
	 * 
	 * @return history String of the history of the operations with numbers 
	 */
	public String toString () 
	{
		return history;
	}
	
	
	/*
	 * Clears all of the operations done and the total
	 */
	public void clear() 
	{
		total = 0;
		history = "0";
	}
}
