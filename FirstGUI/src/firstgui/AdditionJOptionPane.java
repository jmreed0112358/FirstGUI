package firstgui;

import javax.swing.JOptionPane;

public class AdditionJOptionPane
{

	public AdditionJOptionPane( )
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * Exercises the JOptionPane class.
	 */
	public void add( )
	{
		try
		{
			String firstNumber = JOptionPane
					.showInputDialog( "Enter first integer" );
			String secondNumber = JOptionPane
					.showInputDialog( "Enter second integer" );

			int numberOne = Integer.parseInt( firstNumber );
			int numberTwo = Integer.parseInt( secondNumber );

			int sum = numberOne + numberTwo;

			JOptionPane.showMessageDialog( null, "The sum is " + sum,
					"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
		}
		catch( NumberFormatException numberFormatException )
		{
			System.out.println( "Caught NumberFormatException" );

			numberFormatException.printStackTrace( );
		}
	}
}
