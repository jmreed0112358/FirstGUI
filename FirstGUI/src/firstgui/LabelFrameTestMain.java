package firstgui;

import javax.swing.JFrame;

public class LabelFrameTestMain
{

	public LabelFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{

		LabelFrameTest labelFrameTest = new LabelFrameTest( );

		labelFrameTest.draw( );

		labelFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		labelFrameTest.setSize( 275, 275 );
		labelFrameTest.setVisible( true );
	}

}
