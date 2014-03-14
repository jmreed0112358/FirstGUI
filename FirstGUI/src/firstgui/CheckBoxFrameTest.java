package firstgui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrameTest extends JFrame
{
	private JTextField	textField;
	private JCheckBox	boldJCheckBox;
	private JCheckBox	italicJCheckBox;

	public CheckBoxFrameTest( )
	{
		super( "JCheckBox Test" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		textField = new JTextField( "Watch the font style change", 20 );
		add( textField );

		boldJCheckBox = new JCheckBox( "Bold" );
		italicJCheckBox = new JCheckBox( "Italic" );
		add( boldJCheckBox );
		add( italicJCheckBox );

		CheckBoxHandler handler = new CheckBoxHandler( );
		boldJCheckBox.addItemListener( handler );
		italicJCheckBox.addItemListener( handler );
	}

	private class CheckBoxHandler implements ItemListener
	{
		private int	valBold		= Font.PLAIN;
		private int	valItalic	= Font.PLAIN;

		@Override
		public void itemStateChanged( ItemEvent event )
		{
			if ( event.getSource( ) == boldJCheckBox )
			{
				valBold = boldJCheckBox.isSelected( ) ? Font.BOLD : Font.PLAIN;
			}

			if ( event.getSource( ) == italicJCheckBox )
			{
				valItalic = italicJCheckBox.isSelected( ) ? Font.ITALIC
						: Font.PLAIN;
			}

			textField.setFont( new Font( "Serif", valBold + valItalic, 14 ) );
		}

	}
}
