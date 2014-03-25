/**
 * 
 */
package jtextarea;

import javax.swing.JFrame;

/**
 * @author jmreed
 *
 */
public class TextAreaFrameTestMain
{

	/**
	 * 
	 */
	public TextAreaFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		TextAreaFrame textAreaFrame = new TextAreaFrame();
		textAreaFrame.draw( );
		textAreaFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textAreaFrame.setSize( 425, 200 );
		textAreaFrame.setVisible( true );
	}

}
