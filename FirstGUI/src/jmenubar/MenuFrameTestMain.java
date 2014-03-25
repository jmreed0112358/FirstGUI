/**
 * 
 */
package jmenubar;

import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class MenuFrameTestMain
{

	/**
	 * 
	 */
	public MenuFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		MenuFrame menuFrame = new MenuFrame( );
		menuFrame.draw( );

		menuFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		menuFrame.setSize( 500, 200 );
		menuFrame.setVisible( true );
	}

}
