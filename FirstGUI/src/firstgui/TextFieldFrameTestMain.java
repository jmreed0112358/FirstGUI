package firstgui;

import javax.swing.JFrame;

public class TextFieldFrameTestMain
{

	public TextFieldFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		TextFieldFrameTest textFieldFrameTest = new TextFieldFrameTest( );
		textFieldFrameTest.draw( );

		textFieldFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textFieldFrameTest.setSize( 500, 100 );
		textFieldFrameTest.setVisible( true );
	}

}
