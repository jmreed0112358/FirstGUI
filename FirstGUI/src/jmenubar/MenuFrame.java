/**
 * 
 */
package jmenubar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

/**
 * @author jmreed
 * 
 */
public class MenuFrame extends JFrame
{
	private final Color				colorValues[]	= { Color.BLACK,
			Color.BLUE, Color.RED, Color.green		};
	private JRadioButtonMenuItem	colorItems[];
	private JRadioButtonMenuItem	fonts[];
	private JCheckBoxMenuItem		styleItems[];
	private JLabel					displayJLabel;
	private ButtonGroup				fontButtonGroup;
	private ButtonGroup				colorButtonGroup;
	private int						style;

	/**
	 * 
	 */
	public MenuFrame( )
	{
		super( "Using JMenus" );
	}

	public void draw( )
	{
		// File menu
		JMenu fileMenu = new JMenu( "File" );
		fileMenu.setMnemonic( 'F' );

		// Create About... item.
		JMenuItem aboutItem = new JMenuItem( "About..." );
		aboutItem.setMnemonic( 'A' );
		fileMenu.add( aboutItem );
		aboutItem.addActionListener( new AboutActionHandler( ) );

		// Exit item.
		JMenuItem exitItem = new JMenuItem( "Exit" );
		exitItem.setMnemonic( 'x' );
		fileMenu.add( exitItem );
		exitItem.addActionListener( new ExitActionHandler( ) );

		// Create the menu bar.
		JMenuBar bar = new JMenuBar( );
		setJMenuBar( bar );
		bar.add( fileMenu );

		// Format menu stuff.
		JMenu formatMenu = new JMenu( "Format" );
		formatMenu.setMnemonic( 'r' );

		// array listing string colors.
		String colors[] = { "Black", "Blue", "Red", "Green" };

		JMenu colorMenu = new JMenu( "Color" );
		colorMenu.setMnemonic( 'C' );

		// Radio button menu items for colors
		colorItems = new JRadioButtonMenuItem[colors.length];
		colorButtonGroup = new ButtonGroup( );

		ItemHandler itemHandler = new ItemHandler( );

		// Create color radio button items
		for( int i = 0 ; i < colors.length ; ++i )
		{
			colorItems[i] = new JRadioButtonMenuItem( colors[i] );
			colorMenu.add( colorItems[i] );
			colorButtonGroup.add( colorItems[i] );
			colorItems[i].addActionListener( itemHandler );
		}

		colorItems[0].setSelected( true );

		// Add color menu to format menu.
		formatMenu.add( colorMenu );
		formatMenu.addSeparator( );

		// Array listing font names.
		String fontNames[] = { "Serif", "Monospaced", "Sans Serif" };

		// Font Menu stuff.
		JMenu fontMenu = new JMenu( "Font" );
		fontMenu.setMnemonic( 'n' );

		// Create radio button menu items for font names
		fonts = new JRadioButtonMenuItem[fontNames.length];
		fontButtonGroup = new ButtonGroup( );

		// Create Font radio button menu items.
		for( int i = 0 ; i < fontNames.length ; ++i )
		{
			fonts[i] = new JRadioButtonMenuItem( fontNames[i] );
			fontMenu.add( fonts[i] );
			fontButtonGroup.add( fonts[i] );
			fonts[i].addActionListener( itemHandler );
		}

		fonts[0].setSelected( true );
		fontMenu.addSeparator( );

		// Style items.
		String styleNames[] = { "Bold", "Italic" };
		styleItems = new JCheckBoxMenuItem[styleNames.length];
		StyleHandler styleHandler = new StyleHandler( );

		// Create style checkbox menu items.
		for( int i = 0 ; i < styleNames.length ; ++i )
		{
			styleItems[i] = new JCheckBoxMenuItem( styleNames[i] );
			fontMenu.add( styleItems[i] );
			styleItems[i].addItemListener( styleHandler );
		}

		formatMenu.add( fontMenu );
		bar.add( formatMenu );

		// Set up label to display text.
		displayJLabel = new JLabel( "Sample Text", SwingConstants.CENTER );
		displayJLabel.setForeground( colorValues[0] );
		displayJLabel.setFont( new Font( "Serif", Font.PLAIN, 72 ) );

		getContentPane( ).setBackground( Color.CYAN );
		add( displayJLabel, BorderLayout.CENTER );
	}

	private class AboutActionHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			JOptionPane.showMessageDialog( MenuFrame.this,
					"This is an example\nof using menus", "About",
					JOptionPane.PLAIN_MESSAGE );
		}
	}

	private class ExitActionHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			System.exit( 0 );
		}
	}

	private class ItemHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			// Process color selection
			for( int i = 0 ; i < colorItems.length ; ++i )
			{
				if ( colorItems[i].isSelected( ) )
				{
					displayJLabel.setForeground( colorValues[i] );
					break;
				}
			}

			// Process font selection
			for( int i = 0 ; i < fonts.length ; ++i )
			{
				if ( event.getSource( ) == fonts[i] )
				{
					displayJLabel.setFont( new Font( fonts[i].getText( ),
							style, 72 ) );
				}
			}

			repaint( );
		}
	}

	private class StyleHandler implements ItemListener
	{
		@Override
		public void itemStateChanged( ItemEvent event )
		{
			// Process font style selections.
			style = 0; // Initialize state.

			// Check for bold selection.
			if ( styleItems[0].isSelected( ) )
			{
				style += Font.BOLD;
			}

			// Check for italic selection.
			if ( styleItems[1].isSelected( ) )
			{
				style += Font.ITALIC;
			}

			displayJLabel.setFont( new Font(
					displayJLabel.getFont( ).getName( ), style, 72 ) );
			repaint( );
		}
	}
}
