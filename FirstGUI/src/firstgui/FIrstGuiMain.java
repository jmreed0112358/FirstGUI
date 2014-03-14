package firstgui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FIrstGuiMain
{

	public FIrstGuiMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		// AdditionJOptionPane exampleOne = new AdditionJOptionPane( );

		// exampleOne.add( );

		/*
		 * LabelFrameTest labelFrameTest = new LabelFrameTest( );
		 * 
		 * labelFrameTest.draw( );
		 * 
		 * labelFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 * labelFrameTest.setSize( 275, 275 ); labelFrameTest.setVisible( true
		 * );
		 */

		TextFieldFrameTest textFieldFrameTest = new TextFieldFrameTest( );
		textFieldFrameTest.draw( );

		textFieldFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textFieldFrameTest.setSize( 500, 100 );
		textFieldFrameTest.setVisible( true );
	}

}
