package calculators;

/**
 * Calculator used to compute a Fibonacci sequence a number of times determined by the user in a recursive fashion.
 * @author Andrew McKay
 *
 */
public class RecursiveFibonacciCalculator extends FibonacciCalculator implements Calculators 
{
	/**
	 * Create a new FibonacciCalculator to execute the sequence a number of times equal to fValue.
	 * The result of the sequence will be zero until the calculate() method is ran.
	 * @param fValue long integer that determines the number of times the Fibonacci sequence is executed.
	 */
	public RecursiveFibonacciCalculator(long fValue) 
	{
		super(fValue);
	}
	
	@Override
	public void calculate() 
	{
		getCalculationTimer().startTimer();
		
		setFResult(calculateFibonacciSequence(getFValue()));
		
		getCalculationTimer().endTimer();
	}
	
	/**
	 * Run the Fibonacci sequence a number of times equal to fValue and return the result in a recursive fashion.
	 * @param fValue long integer representing the number of times the sequence is to be ran
	 * @return long integer representing the results of the Fibonacci sequence for fValue.
	 */
	private long calculateFibonacciSequence(long fValue)
	{
		if(fValue == 0 || fValue == 1)
			return fValue;
		else
			return calculateFibonacciSequence(fValue - 1) + calculateFibonacciSequence(fValue - 2);
	}
}
