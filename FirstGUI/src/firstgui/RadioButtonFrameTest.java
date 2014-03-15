package firstgui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrameTest extends JFrame
{
	private JTextField		textField;
	private Font			plainFont;
	private Font			boldFont;
	private Font			italicFont;
	private Font			boldItalicFont;
	private JRadioButton	plainJRadioButton;
	private JRadioButton	boldJRadioButton;
	private JRadioButton	italicJRadioButton;
	private JRadioButton	boldItalicJRadioButton;
	private ButtonGroup		radioGroup;

	public RadioButtonFrameTest( )
	{
		super( "Testing RadioButtonFrame " );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		textField = new JTextField( "Watch the font style change" );
		add( textField );

		// Create radio buttons.
		plainJRadioButton = new JRadioButton( "Plain", true );
		boldJRadioButton = new JRadioButton( "Bold", false );
		italicJRadioButton = new JRadioButton( "Italic", false );
		boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false );
		add( plainJRadioButton );
		add( boldJRadioButton );
		add( italicJRadioButton );
		add( boldItalicJRadioButton );

		// Create logical relationship between radio buttons. Radio Button
		// Group.
		radioGroup = new ButtonGroup( );
		radioGroup.add( plainJRadioButton );
		radioGroup.add( boldJRadioButton );
		radioGroup.add( italicJRadioButton );
		radioGroup.add( boldItalicJRadioButton );

		// Create font objects.
		plainFont = new Font( "Serif", Font.PLAIN, 14 );
		boldFont = new Font( "Bold", Font.BOLD, 14 );
		italicFont = new Font( "Italic", Font.ITALIC, 14 );
		boldItalicFont = new Font( "Bold/Italic", Font.BOLD + Font.ITALIC, 14 );
		textField.setFont( plainFont );

		// Register events for the radio buttons.
		plainJRadioButton.addItemListener( new RadioButtonHandler( plainFont ) );
		boldJRadioButton.addItemListener( new RadioButtonHandler( boldFont ) );
		italicJRadioButton
				.addItemListener( new RadioButtonHandler( italicFont ) );
		boldItalicJRadioButton.addItemListener( new RadioButtonHandler(
				boldItalicFont ) );
	}
	
	private class RadioButtonHandler implements ItemListener
	{
		private Font font;
		
		public RadioButtonHandler( Font f )
		{
			font = f;
		}
		
		@Override
		public void itemStateChanged( ItemEvent e )
		{
			textField.setFont( font );
		}
		
	}

}
