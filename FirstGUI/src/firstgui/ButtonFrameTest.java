package firstgui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrameTest extends JFrame
{
	private JButton	plainJButton;
	private JButton	fancyJButton;

	public ButtonFrameTest( )
	{
		super( "Testing Buttons" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		plainJButton = new JButton( "Plain Button" );
		add( plainJButton );

		Icon smiley = new ImageIcon( "data/small_smiley_face.jpg" );

		fancyJButton = new JButton( "Fancy button", smiley );
		fancyJButton.setRolloverIcon( smiley );
		add( fancyJButton );

		ButtonHandler handler = new ButtonHandler( );

		fancyJButton.addActionListener( handler );
		plainJButton.addActionListener( handler );
	}

	private class ButtonHandler implements ActionListener
	{

		@Override
		public void actionPerformed( ActionEvent event )
		{
			JOptionPane.showMessageDialog( ButtonFrameTest.this, String.format(
					"You pressed: %s", event.getActionCommand( ) ) );
		}
	}

}
