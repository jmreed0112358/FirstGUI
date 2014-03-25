/**
 * 
 */
package layoutmanagertest;

import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class BorderLayoutTestMain
{

	/**
	 * 
	 */
	public BorderLayoutTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame( );
		borderLayoutFrame.draw( );
		borderLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		borderLayoutFrame.setSize( 300, 200 );
		borderLayoutFrame.setVisible( true );
	}

}
