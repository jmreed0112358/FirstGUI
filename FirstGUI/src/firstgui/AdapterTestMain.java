package firstgui;

import javax.swing.JFrame;

public class AdapterTestMain
{

	public AdapterTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame( );

		mouseDetailsFrame.draw( );

		mouseDetailsFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseDetailsFrame.setSize( 400, 150 );
		mouseDetailsFrame.setVisible( true );
	}

}
