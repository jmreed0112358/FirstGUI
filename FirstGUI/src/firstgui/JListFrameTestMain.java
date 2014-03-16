package firstgui;

import javax.swing.JFrame;

public class JListFrameTestMain
{

	public JListFrameTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		JListFrameTest jListFrameTest = new JListFrameTest( );
		
		jListFrameTest.draw( );
		
		jListFrameTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jListFrameTest.setSize( 350, 150 );
		jListFrameTest.setVisible( true );
	}

}
