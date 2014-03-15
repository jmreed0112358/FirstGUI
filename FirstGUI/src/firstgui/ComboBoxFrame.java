package firstgui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame
{
	private JComboBox	fontsJComboBox;
	private JLabel		label;

	Font				plainFont		= new Font( "Serif", Font.PLAIN, 14 );
	Font				boldFont		= new Font( "Serif", Font.BOLD, 14 );
	Font				italicFont		= new Font( "Serif", Font.ITALIC, 14 );
	Font				boldItalicFont	= new Font( "Serif", Font.BOLD
												+ Font.ITALIC, 14 );

	Font[]				fontArray		= { plainFont, boldFont, italicFont,
			boldItalicFont				};

	public ComboBoxFrame( )
	{
		super( "Testing JComboBox" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		label = new JLabel( );
		label.setText( "Hello World!" );

		String[] names = { "Plain", "Bold", "Italic", "Bold/Italic" };

		fontsJComboBox = new JComboBox( names );
		fontsJComboBox.setMaximumRowCount( 4 );

		fontsJComboBox.addItemListener( new ItemListener( )
		{
			@Override
			public void itemStateChanged( ItemEvent event )
			{
				if ( event.getStateChange( ) == ItemEvent.SELECTED )
				{
					label.setFont( fontArray[fontsJComboBox.getSelectedIndex( )] );
				}
			}

		} );
		add( fontsJComboBox );
		
		add( label );

	}

}
