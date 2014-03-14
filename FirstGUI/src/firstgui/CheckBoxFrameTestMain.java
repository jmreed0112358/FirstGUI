package firstgui;

import javax.swing.JFrame;

public class CheckBoxFrameTestMain
{

	public CheckBoxFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		CheckBoxFrameTest checkBoxFrameTest = new CheckBoxFrameTest( );

		checkBoxFrameTest.draw( );

		checkBoxFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		checkBoxFrameTest.setSize( 275, 100 );
		checkBoxFrameTest.setVisible( true );
	}

}
