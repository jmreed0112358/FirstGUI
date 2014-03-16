package firstgui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListFrameTest extends JFrame
{
	private JList<Object>	colorJList;
	private final String	colorNames[]	= { "Black", "Blue", "Cyan",
			"Dark Grey", "Grey", "Green", "Light Grey", "Magenta", "Orange",
			"Pink", "Red", "White", "Yellow" };
	private final Color		colors[]		= { Color.BLACK, Color.BLUE,
			Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
			Color.RED, Color.WHITE, Color.YELLOW };

	public JListFrameTest( )
	{
		super( "Testing JListFrame" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		colorJList = new JList<Object>( colorNames );
		colorJList.setVisibleRowCount( 5 );

		colorJList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

		add( new JScrollPane( colorJList ) );

		colorJList.addListSelectionListener( new ListSelectionListener( )
		{
			@Override
			public void valueChanged( ListSelectionEvent e )
			{
				getContentPane( ).setBackground(
						colors[colorJList.getSelectedIndex( )] );
			}
		} );
	}
}
