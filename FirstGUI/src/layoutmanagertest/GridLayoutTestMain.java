/**
 * 
 */
package layoutmanagertest;

import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class GridLayoutTestMain
{

	/**
	 * 
	 */
	public GridLayoutTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		GridLayoutFrame gridLayoutFrame = new GridLayoutFrame( );
		gridLayoutFrame.draw( );
		gridLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gridLayoutFrame.setSize( 300, 200 );
		gridLayoutFrame.setVisible( true );
	}

}
