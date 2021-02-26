package calculators;

import timers.Timer;

/**
 * Calculator used to compute a Fibonacci sequence a number of times determined by the user.
 * @author Andrew McKay
 *
 */
public class FibonacciCalculator implements Calculators 
{
	private long fValue;
	private Timer calculationTimer;
	
	/**
	 * Create a new FibonacciCalculator to execute the sequence a number of times equal to fValue.
	 * @param fValue long integer that determines the number of times the Fibonacci sequence is executed.
	 */
	public FibonacciCalculator(long fValue)
	{
		setFValue(fValue);
		setCalculationTimer(new Timer());
	}
	
	/**
	 * Retrieve the fValue used in the sequence.
	 * @return FibonacciCalculator.fValue
	 */
	public long getFValue()
	{
		return fValue;
	}
	/**
	 * Set the fValue to determine the number of times the sequence is executed.
	 * @param fValue long integer that determines the number of times the Fibonacci sequence is executed.
	 */
	public void setFValue(long fValue)
	{
		this.fValue = fValue;
	}
	
	
	/**
	 * Retrieves the Timer object for this FibonacciCalculator
	 * @return FibonacciCalculator.calculationTimer
	 */
	public Timer getCalculationTimer()
	{
		return calculationTimer;
	}
	/**
	 * Assign a Timer to be used for this Calculator.
	 * @param calculationTimer Timer object to record the length of time it requires to run the Fibonacci sequence.
	 */
	public void setCalculationTimer(Timer calculationTimer)
	{
		this.calculationTimer = calculationTimer;
	}
	
	@Override
	public void calculate() 
	{
		//Start the timer
		calculationTimer.startTimer();
		
		
		
		//End the timer
		calculationTimer.endTimer();
	}
	
	public long calculateFibonacciSequence(long fValue)
	{
		long prevNumber = 0;
		long fResult = 0;
		for(long x = 0; x <= fValue; x++)
		{
			fResult += prevNumber;
		}
		
		return fResult;
	}
}
