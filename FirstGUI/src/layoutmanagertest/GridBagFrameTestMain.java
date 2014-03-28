/**
 * 
 */
package layoutmanagertest;

import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class GridBagFrameTestMain
{

	/**
	 * 
	 */
	public GridBagFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		GridBagFrame gridBagFrame = new GridBagFrame( );
		gridBagFrame.draw( );

		gridBagFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gridBagFrame.setSize( 300, 150 );
		gridBagFrame.setVisible( true );
	}

}
