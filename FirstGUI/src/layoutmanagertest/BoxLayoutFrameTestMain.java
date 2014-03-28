/**
 * 
 */
package layoutmanagertest;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class BoxLayoutFrameTestMain
{

	/**
	 * 
	 */
	public BoxLayoutFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		BoxLayoutFrame boxLayoutFrame = new BoxLayoutFrame( );
		boxLayoutFrame.draw( );
		
		boxLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		boxLayoutFrame.setSize( 400, 220 );
		boxLayoutFrame.setVisible( true );
	}

}
