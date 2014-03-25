package firstgui;

import javax.swing.JFrame;

public class MouseEventHandlingTestMain
{

	public MouseEventHandlingTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		MouseEventHandlingTest mouseEventHandlingTest = new MouseEventHandlingTest( );
		
		mouseEventHandlingTest.draw( );
		mouseEventHandlingTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseEventHandlingTest.setSize( 300, 100 );
		mouseEventHandlingTest.setVisible( true );
	}

}
