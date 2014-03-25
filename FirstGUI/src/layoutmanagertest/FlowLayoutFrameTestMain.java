/**
 * 
 */
package layoutmanagertest;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class FlowLayoutFrameTestMain
{

	/**
	 * 
	 */
	public FlowLayoutFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame( );
		flowLayoutFrame.draw( );
		flowLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		flowLayoutFrame.setSize( 300, 75 );
		flowLayoutFrame.setVisible( true );
	}

}
