/**
 * 
 */
package layoutmanagertest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author jmreed
 * 
 */
public class BorderLayoutFrame extends JFrame
{
	private JButton			buttons[];
	private final String	names[]	= { "Hide North", "Hide South",
			"Hide East", "Hide West", "Hide Center" };
	private BorderLayout	layout;

	/**
	 * 
	 */
	public BorderLayoutFrame( )
	{
		super( "BorderLayout Demo" );
	}

	public void draw( )
	{
		layout = new BorderLayout( 5, 5 ); // 5 pixel gaps.
		setLayout( layout );

		buttons = new JButton[names.length];

		for( int i = 0 ; i < buttons.length ; ++i )
		{
			buttons[i] = new JButton( names[i] );
			buttons[i].addActionListener( new ButtonEventHandler( ) );
		}

		add( buttons[0], BorderLayout.NORTH );
		add( buttons[1], BorderLayout.SOUTH );
		add( buttons[2], BorderLayout.EAST );
		add( buttons[3], BorderLayout.WEST );
		add( buttons[4], BorderLayout.CENTER );
	}

	private class ButtonEventHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			// Nice to know Java supports this loop method. :)
			for( JButton button : buttons )
			{
				if ( event.getSource( ) == button )
				{
					button.setVisible( false );
				}
				else
				{
					button.setVisible( true );
				}
			}
			
			layout.layoutContainer( getContentPane( ) );
		}
	}
}
