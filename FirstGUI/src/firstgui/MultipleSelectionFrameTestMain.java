package firstgui;

import javax.swing.JFrame;

public class MultipleSelectionFrameTestMain
{

	public MultipleSelectionFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		MultipleSelectionFrameTest multipleSelectionFrameTest = new MultipleSelectionFrameTest( );
		
		multipleSelectionFrameTest.draw( );
		
		multipleSelectionFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		multipleSelectionFrameTest.setSize( 350, 155 );
		multipleSelectionFrameTest.setVisible( true );
	}

}
