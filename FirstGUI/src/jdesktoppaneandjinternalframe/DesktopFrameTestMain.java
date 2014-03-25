/**
 * 
 */
package jdesktoppaneandjinternalframe;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class DesktopFrameTestMain
{

	/**
	 * 
	 */
	public DesktopFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		DesktopFrame desktopFrame = new DesktopFrame();
		
		desktopFrame.draw( );
		desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE	 );
		desktopFrame.setSize( 600, 480 );
		desktopFrame.setVisible( true );
	}

}
