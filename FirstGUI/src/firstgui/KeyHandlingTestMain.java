/**
 * 
 */
package firstgui;

import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class KeyHandlingTestMain
{

	/**
	 * 
	 */
	public KeyHandlingTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		KeyHandlingTest keyHandlingTest = new KeyHandlingTest( );
		keyHandlingTest.draw( );
		keyHandlingTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		keyHandlingTest.setSize( 350, 100 );
		keyHandlingTest.setVisible( true );
	}

}
