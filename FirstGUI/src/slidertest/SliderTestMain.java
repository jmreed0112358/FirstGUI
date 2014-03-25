/**
 * 
 */
package slidertest;

import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class SliderTestMain
{

	/**
	 * 
	 */
	public SliderTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		SliderFrame sliderFrame = new SliderFrame( );
		sliderFrame.draw( );
		sliderFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		sliderFrame.setSize( 220, 270 );
		sliderFrame.setVisible( true );
	}

}
