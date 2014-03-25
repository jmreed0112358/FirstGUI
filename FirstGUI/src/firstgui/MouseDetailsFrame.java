/**
 * 
 */
package firstgui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author jmreed
 *
 */
public class MouseDetailsFrame extends JFrame
{
	private String details;
	private JLabel statusBar;
	
	/**
	 * 
	 */
	public MouseDetailsFrame( )
	{
		super( "Testing Adapters" );
	}

	public void draw( )
	{
		statusBar = new JLabel( "Click the mouse" );
		add( statusBar, BorderLayout.SOUTH );
		addMouseListener( new MouseClickHandler( ) );
	}
	
	private class MouseClickHandler extends MouseAdapter
	{
		public void mouseClicked( MouseEvent event )
		{
			int xPos = event.getX( );
			int yPos = event.getY( );
			
			details = String.format( "Clicked %d times", event.getClickCount( ) );
			
			if ( event.isMetaDown( ) )
			{
				details += " with right mouse button";
			}
			else if ( event.isAltDown( ) )
			{
				details += " with center mouse button";
			}
			else
			{
				details += " with left mouse button";
			}
			
			statusBar.setText( details );
		}
	}
	
}
