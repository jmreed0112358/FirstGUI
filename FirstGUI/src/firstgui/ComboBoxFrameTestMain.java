package firstgui;

import javax.swing.JFrame;

public class ComboBoxFrameTestMain
{

	public ComboBoxFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		ComboBoxFrame comboBoxFrameTest = new ComboBoxFrame( );

		comboBoxFrameTest.draw( );

		comboBoxFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		comboBoxFrameTest.setSize( 225, 60 );
		comboBoxFrameTest.setVisible( true );
	}

}
