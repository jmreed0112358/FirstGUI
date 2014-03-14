package firstgui;

import javax.swing.JFrame;

public class ButtonFrameTestMain
{

	public ButtonFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		ButtonFrameTest buttonFrameTest = new ButtonFrameTest( );

		buttonFrameTest.draw( );

		buttonFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		buttonFrameTest.setSize( 325, 150 );
		buttonFrameTest.setVisible( true );
	}

}
