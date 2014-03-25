/**
 * 
 */
package complexjpanelbasedgui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author jmreed
 * 
 */
public class PanelFrame extends JFrame
{
	private JPanel	buttonJPanel;
	private JButton	buttons[];

	/**
	 * 
	 */
	public PanelFrame( )
	{
		super( "Complex JPanel based GUI Demo" );
	}

	public void draw( )
	{
		buttons = new JButton[5];
		buttonJPanel = new JPanel( );
		buttonJPanel.setLayout( new GridLayout( 1, buttons.length ) );

		for( int i = 0 ; i < buttons.length ; ++i )
		{
			buttons[i] = new JButton( "Button " + ( i + 1 ) );
			buttonJPanel.add( buttons[i] );
		}

		add( buttonJPanel, BorderLayout.SOUTH );
	}
}
