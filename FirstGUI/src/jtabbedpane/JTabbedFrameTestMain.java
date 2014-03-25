/**
 * 
 */
package jtabbedpane;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class JTabbedFrameTestMain
{

	/**
	 * 
	 */
	public JTabbedFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame( );
		tabbedPaneFrame.draw();
		
		tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tabbedPaneFrame.setSize( 250, 200 );
		tabbedPaneFrame.setVisible( true );
	}

}
