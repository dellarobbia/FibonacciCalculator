package calculators;

/**
 * Calculator used to compute a Fibonacci sequence a number of times determined by the user in a recursive fashion.
 * @author Andrew McKay
 *
 */
public class RecursiveFibonacciCalculator extends FibonacciCalculator implements Calculators 
{
	private long sequenceNumber = 0;
	private long prevNumber = 0;
	
	/**
	 * Create a new FibonacciCalculator to execute the sequence a number of times equal to fValue.
	 * The result of the sequence will be zero until the calculate() method is ran.
	 * @param fValue long integer that determines the number of times the Fibonacci sequence is executed.
	 */
	public RecursiveFibonacciCalculator(long fValue) 
	{
		super(fValue);
		setSequenceNumber(0);
		setPrevNumber(0);
	}
	
	/**
	 * Retrieves the current step the Fibonacci calculation is on
	 * @return RecursiveFibonacciCalculator.sequenceNumber
	 */
	public long getSequenceNumber()
	{
		return sequenceNumber;
	}
	/**
	 * Set the current sequence number for the Fibonacci sequence calculation.
	 * @param sequenceNumber long integer representing the current calculation step number.
	 */
	public void setSequenceNumber(long sequenceNumber)
	{
		this.sequenceNumber = sequenceNumber;
	}
	
	/**
	 * Retrieves the previous number that was used in the Fibonacci sequence calculation.
	 * @return RecursiveFibonacciCalculator.prevNumber
	 */
	public long getPrevNumber()
	{
		return prevNumber;
	}
	/**
	 * Set the previous number that was used in the Fibonacci sequence calculation.
	 * @param prevNumber long integer representing the resulting value from the previous step in the Fibonacci sequence.
	 */
	public void setPrevNumber(long prevNumber)
	{
		this.prevNumber = prevNumber;
	}
	
	@Override
	public void calculate() 
	{
		getCalculationTimer().startTimer();
		
		setFResult(calculateFibonacciSequence());
		
		getCalculationTimer().endTimer();
	}
	
	/**
	 * Run the Fibonacci sequence a number of times equal to fValue and return the result in a recursive fashion.
	 * @return long integer representing the results of the Fibonacci sequence for fValue.
	 */
	private long calculateFibonacciSequence()
	{
		long fResult = 0;
		
		if(getFValue() == 0)
			return 0;
		else if(sequenceNumber > getFValue())
		{
			setFResult(getFResult() + prevNumber);
			prevNumber = getFResult();
			sequenceNumber++;
			setFResult(calculateFibonacciSequence());
		}
		
		return fResult;
	}
}
