/**
 * 
 */
package pluggablelookandfeel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 * @author jmreed
 * 
 */
public class LookAndFeelFrame extends JFrame
{
	private final String		strings[]	= { "Metal", "Motif", "Windows" };
	private LookAndFeelInfo[]	looks;
	private JRadioButton		radio[];
	private ButtonGroup			group;
	private JButton				button;
	private JLabel				label;
	private JComboBox			comboBox;

	/**
	 * 
	 */
	public LookAndFeelFrame( )
	{
		super( "Look and Feel Demo" );
	}

	public void draw( )
	{
		// North Panel.
		JPanel northPanel = new JPanel( );
		northPanel.setLayout( new GridLayout( 3, 1, 0, 5 ) );

		label = new JLabel( "This is a Metal look-and-feel",
				SwingConstants.CENTER );
		northPanel.add( label );

		button = new JButton( "JButton" );
		northPanel.add( button );

		comboBox = new JComboBox( strings );
		northPanel.add( comboBox );

		// Create array for radio buttons.
		radio = new JRadioButton[strings.length];

		// South Panel.
		JPanel southPanel = new JPanel( );
		southPanel.setLayout( new GridLayout( 1, radio.length ) );

		group = new ButtonGroup( );
		ItemHandler handler = new ItemHandler( );

		for( int i = 0 ; i < radio.length ; ++i )
		{
			radio[i] = new JRadioButton( strings[i] );
			radio[i].addItemListener( handler );
			group.add( radio[i] );
			southPanel.add( radio[i] );
		}

		add( northPanel, BorderLayout.NORTH );
		add( southPanel, BorderLayout.SOUTH );

		// get installed look-and-feel information.
		looks = UIManager.getInstalledLookAndFeels( );

		radio[0].setSelected( true );
	}

	private void changeTheLookAndFeel( int value )
	{
		try
		{
			UIManager.setLookAndFeel( looks[value].getClassName( ) );

			SwingUtilities.updateComponentTreeUI( this );
		}
		catch( Exception e )
		{
			e.printStackTrace( );
		}
	}

	private class ItemHandler implements ItemListener
	{
		@Override
		public void itemStateChanged( ItemEvent e )
		{
			for( int i = 0 ; i < radio.length ; ++i )
			{
				if ( radio[i].isSelected( ) )
				{
					label.setText( String.format( "This is a %s look-and-feel",
							strings[i] ) );
					comboBox.setSelectedIndex( i );
					changeTheLookAndFeel( i );
				}
			}
		}
	}
}
