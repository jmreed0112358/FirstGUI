/**
 * 
 */
package pluggablelookandfeel;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class LookAndFeelFrameTestMain
{

	/**
	 * 
	 */
	public LookAndFeelFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		LookAndFeelFrame lookAndFeelFrame = new LookAndFeelFrame();
		lookAndFeelFrame.draw( );
		lookAndFeelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE	);
		lookAndFeelFrame.setSize( 300, 200 );
		lookAndFeelFrame.setVisible(  true );
	}

}
