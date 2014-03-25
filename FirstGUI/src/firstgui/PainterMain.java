/**
 * 
 */
package firstgui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author jmreed
 * 
 */
public class PainterMain
{

	/**
	 * 
	 */
	public PainterMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		PainterFrame painterFrame = new PainterFrame( );
		painterFrame.draw( );

		painterFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		painterFrame.setSize( 400, 200 );
		painterFrame.setVisible( true );
	}

}
