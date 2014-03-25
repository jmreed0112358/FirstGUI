package popupframe;

import javax.swing.JFrame;
/**
 * 
 */

/**
 * @author jmreed
 *
 */
public class PopupFrameTestMain
{

	/**
	 * 
	 */
	public PopupFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		PopupFrame popupFrame = new PopupFrame();
		popupFrame.draw();
		
		popupFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		popupFrame.setSize( 300, 200  );
		popupFrame.setVisible( true );
	}

}
