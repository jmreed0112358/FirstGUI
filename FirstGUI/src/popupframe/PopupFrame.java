/**
 * 
 */
package popupframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

/**
 * @author jmreed
 * 
 */
public class PopupFrame extends JFrame
{
	private JRadioButtonMenuItem	items[];
	private final Color				colorValues[]	= { Color.BLUE,
			Color.YELLOW, Color.RED				};
	private JPopupMenu				popupMenu;

	/**
	 * 
	 */
	public PopupFrame( )
	{
		super( "Using JPopupMenus" );
	}

	public void draw( )
	{
		ItemHandler handler = new ItemHandler( );
		String colors[] = { "Blue", "Yellow", "Red" };

		ButtonGroup colorGroup = new ButtonGroup( );
		popupMenu = new JPopupMenu( );
		items = new JRadioButtonMenuItem[3];

		// Construct menu item, add to popup menu, enable event handling.
		for( int i = 0 ; i < items.length ; ++i )
		{
			items[i] = new JRadioButtonMenuItem( colors[i] );
			popupMenu.add( items[i] );
			colorGroup.add( items[i] );
			items[i].addActionListener( handler );
		}

		//add( popupMenu, BorderLayout.CENTER );

		setBackground( Color.WHITE );

		addMouseListener( new MouseHandler( ) );
	}

	private class ItemHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			for( int i = 0 ; i < items.length ; ++i )
			{
				if ( event.getSource( ) == items[i] )
				{
					getContentPane( ).setBackground( colorValues[i] );
					return;
				}
			}
		}
	}

	private class MouseHandler extends MouseAdapter
	{
		// Handle mouse press event.
		public void mousePressed( MouseEvent event )
		{
			System.out.println( "mousePressed" );
			checkForTriggerEvent( event );
		}

		// Handle mouse release event.
		public void mouseReleased( MouseEvent event )
		{
			System.out.println( "mouseReleased" );
			checkForTriggerEvent( event );
		}

		// Determine whether event should trigger popup menu.
		private void checkForTriggerEvent( MouseEvent event )
		{
			System.out.println( "checkForTriggerEvent" );

			if ( event.isPopupTrigger( ) )
			{
				System.out.println( "Here?" );
				popupMenu.show( event.getComponent( ), event.getX( ),
						event.getY( ) );
			}
		}
	}
}
