package firstgui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrameTest extends JFrame
{
	private JList<Object>	colorJList;
	private JList<Object>	copyJList;
	private JButton			copyJButton;
	private final String	colorNames[]	= { "Black", "Blue", "Cyan",
			"Dark Grey", "Grey", "Green", "Light Grey", "Magenta", "Orange",
			"Pink", "Red", "White", "Yellow" };

	public MultipleSelectionFrameTest( )
	{
		super( "Testing JLists with multiple selection support" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		colorJList = new JList<Object>( colorNames );
		colorJList.setVisibleRowCount( 5 );
		colorJList
				.setSelectionMode( ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		add( new JScrollPane( colorJList ) );

		copyJButton = new JButton( "Copy >>>" );
		copyJButton.addActionListener( new ActionListener( )
		{
			@Override
			public void actionPerformed( ActionEvent e )
			{
				copyJList.setListData( colorJList.getSelectedValuesList( )
						.toArray( ) );
			}
		} );
		
		add( copyJButton );
		copyJList = new JList<Object>();
		copyJList.setFixedCellWidth( 100 );
		copyJList.setFixedCellHeight( 15 );
		copyJList.setSelectionMode(  ListSelectionModel.SINGLE_INTERVAL_SELECTION );
		add( new JScrollPane( copyJList ) );
	}
}
