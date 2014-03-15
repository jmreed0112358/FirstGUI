package firstgui;

import javax.swing.JFrame;

public class RadioButtonFrameTestMain
{

	public RadioButtonFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		RadioButtonFrameTest radioButtonFrameTest = new RadioButtonFrameTest( );
		
		radioButtonFrameTest.draw( );
		
		radioButtonFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrameTest.setSize( 300, 100  );
		radioButtonFrameTest.setVisible( true );
	}

}
