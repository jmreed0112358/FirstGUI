/**
 * 
 */
package layoutmanagertest;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class GridLayoutFrame extends JFrame
{
	private JButton			buttons[];
	private final String	names[]	= { "one", "two", "three", "four", "five",
			"six"					};
	private boolean			toggle	= true;
	private Container		container;
	private GridLayout		gridLayout1;
	private GridLayout		gridLayout2;

	/**
	 * 
	 */
	public GridLayoutFrame( )
	{
		super( "GridLayout Demo" );
	}

	public void draw( )
	{
		gridLayout1 = new GridLayout( 2, 3, 5, 5 ); // 2x3 grid, gaps of 5
													// pixels.
		gridLayout2 = new GridLayout( 3, 2 ); // 3x2 grid, no gaps.

		container = getContentPane( );
		setLayout( gridLayout1 );

		buttons = new JButton[names.length];

		for( int i = 0 ; i < buttons.length ; ++i )
		{
			buttons[i] = new JButton( names[i] );
			buttons[i].addActionListener( new ButtonActionHandler( ) );
			add( buttons[i] );
		}
	}

	private class ButtonActionHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			if ( toggle )
			{
				container.setLayout( gridLayout2 );
			}
			else
			{
				container.setLayout( gridLayout1 );
			}

			toggle = !toggle;

			container.validate( );
		}
	}
}
