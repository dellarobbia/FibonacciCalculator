package main;

import java.util.Scanner;

import calculators.*;

/**
 * Main class for the Fibonacci Sequence Program
 * @author Andrew McKay
 *
 */
public class Main 
{

	public static void main(String[] args) 
	{
		//Prompt user for the fValue
		long fValue = fValuePrompt(new Scanner(System.in));
		
		//Run the Fibonacci sequence for fValue iteratively
		FibonacciCalculator iterativeFibonacciCalculator = new FibonacciCalculator(fValue);
		iterativeFibonacciCalculator.calculate();
		displayResults(iterativeFibonacciCalculator, "Iterative Calculator");
		
		//Run the Fibonacci sequence for fValue recursively
		RecursiveFibonacciCalculator recursiveFibonacciCalculator = new RecursiveFibonacciCalculator(fValue);
		recursiveFibonacciCalculator.calculate();
		displayResults(recursiveFibonacciCalculator, "Recursive Calculator");
	}
	
	/**
	 * Prompts user for the fValue to use in the Fibonacci sequence calculation.
	 * @param userInput Scanner object to read user input
	 * @return user's input fValue
	 */
	private static long fValuePrompt(Scanner userInput)
	{
		System.out.println("Enter the number of times the Fibonacci sequence will run:");
		return userInput.nextLong();
	}
	
	/**
	 * Displays the results of the Fibonacci calculation to the console.
	 * @param fibonacciCalculator a FibonacciCalculator object
	 * @param calculatorName a String that identifies the FibonacciCalculator used to produce the results.
	 */
	private static void displayResults(FibonacciCalculator fibonacciCalculator, String calculatorName)
	{
		long resultValue = fibonacciCalculator.getFResult();
		long calculationTime = fibonacciCalculator.getCalculationTimer().getResultTime();
		
		System.out.print(calculatorName + ":\n");
		System.out.print("Result: " + resultValue + "\n");
		System.out.print("Calculation time (in ns): " + calculationTime + "\n\n");
	}
}