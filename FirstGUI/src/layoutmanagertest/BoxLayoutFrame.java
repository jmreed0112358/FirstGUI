/**
 * 
 */
package layoutmanagertest;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * @author jmreed
 * 
 */
public class BoxLayoutFrame extends JFrame
{

	/**
	 * 
	 */
	public BoxLayoutFrame( )
	{
		super( "Demostrating BoxLayout" );
	}

	public void draw( )
	{
		// Create Box containers with BoxLayout.
		Box horizontalOne = Box.createHorizontalBox( );
		Box verticalOne = Box.createVerticalBox( );
		Box horizontalTwo = Box.createHorizontalBox( );
		Box verticalTwo = Box.createVerticalBox( );

		final int SIZE = 3;

		// Add buttons to Box horizontalOne.
		for( int i = 0 ; i < SIZE ; ++i )
		{
			horizontalOne.add( new JButton( "Button " + i ) );
		}

		// Create strut and add buttons to Box verticalOne
		for( int i = 0 ; i < SIZE ; ++i )
		{
			verticalOne.add( Box.createVerticalStrut( 25 ) );
			verticalOne.add( new JButton( "Button " + i ) );
		}

		// Create horizontal glue and add buttons to Box horizontalTwo
		for( int i = 0 ; i < SIZE ; ++i )
		{
			horizontalTwo.add( Box.createHorizontalGlue( ) );
			horizontalTwo.add( new JButton( "Button " + i ) );
		}

		// Create rigid area and add buttons to Box verticalTwo
		for( int i = 0 ; i < SIZE ; ++i )
		{
			verticalTwo.add( Box.createRigidArea( new Dimension( 12, 8 ) ) );
			verticalTwo.add( new JButton( "Button " + i ) );
		}

		// Create vertical glue and add buttons to panel.
		JPanel panel = new JPanel( );
		panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );

		for( int i = 0 ; i < SIZE ; ++i )
		{
			panel.add( Box.createGlue( ) );
			panel.add( new JButton( "Button " + i ) );
		}

		// Create a JTabbedPane
		JTabbedPane tabs = new JTabbedPane( JTabbedPane.TOP,
				JTabbedPane.SCROLL_TAB_LAYOUT );
		
		// Place each container on tabbed pane.
		tabs.addTab( "Horizontal Box", horizontalOne );
		tabs.addTab( "Vertical Box with Struts", verticalOne );
		tabs.addTab( "Horizontal Box with Glue", horizontalTwo );
		tabs.addTab( "Vertical Box with Rigid Areas", verticalTwo );
		tabs.addTab( "Vertical Box with Glue", panel );
		
		// Place tabs on frame.
		add( tabs );
	}
}
