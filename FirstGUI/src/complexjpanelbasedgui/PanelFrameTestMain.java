/**
 * 
 */
package complexjpanelbasedgui;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class PanelFrameTestMain
{

	/**
	 * 
	 */
	public PanelFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		PanelFrame panelFrame = new PanelFrame();
		panelFrame.draw( );
		panelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		panelFrame.setSize( 450, 200 );
		panelFrame.setVisible( true );
	}

}
