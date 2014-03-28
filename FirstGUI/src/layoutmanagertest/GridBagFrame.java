/**
 * 
 */
package layoutmanagertest;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author jmreed
 * 
 */
public class GridBagFrame extends JFrame
{
	private GridBagLayout		layout;
	private GridBagConstraints	constraints;

	/**
	 * 
	 */
	public GridBagFrame( )
	{
		super( "GridBagLayout Demo" );
	}

	public void draw( )
	{
		layout = new GridBagLayout( );
		setLayout( layout );
		constraints = new GridBagConstraints( );

		// Create GUI components.
		JTextArea textAreaOne = new JTextArea( "TextAreaOne", 5, 10 );
		JTextArea textAreaTwo = new JTextArea( "TextAreaTwo", 2, 2 );

		String names[] = { "Iron", "Steel", "Brass" };
		JComboBox comboBox = new JComboBox( names );

		JTextField textField = new JTextField( "TextField" );
		JButton buttonOne = new JButton( "Button One" );
		JButton buttonTwo = new JButton( "Button Two" );
		JButton buttonThree = new JButton( "Button Three" );

		// weightx and weighty for textAreaOne are both 0: the default.
		// anchor for all components is CENTER: the default.
		constraints.fill = GridBagConstraints.BOTH;
		addComponent( textAreaOne, 0, 0, 1, 3 );

		// weightx and weighty for buttonOne are both 0: the default.
		constraints.fill = GridBagConstraints.HORIZONTAL;
		addComponent( buttonOne, 0, 1, 2, 1 );

		// weightx and weighty for comboBox are both 0: the default.
		// Fill is HORIZONTAL
		addComponent( comboBox, 2, 1, 2, 1 );

		// buttonTwo
		constraints.weightx = 1000; // Can grow wider.
		constraints.weighty = 1; // Can grow taller.
		constraints.fill = GridBagConstraints.BOTH;
		addComponent( buttonTwo, 1, 1, 1, 1 );

		// fill is BOTH for buttonThree.
		constraints.weightx = 0;
		constraints.weighty = 0;
		addComponent( buttonThree, 1, 2, 1, 1 );
		
		// weightx and weighty for textField are both 0, fill is BOTH.
		addComponent( textField, 3, 0, 2, 1 );
		
		// weightx and weighty for textAreaTwo are both 0, fill is BOTH.
		addComponent( textAreaTwo, 3, 2, 1, 1 );
	}

	private void addComponent( Component component, int row, int column,
			int width, int height )
	{
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		layout.setConstraints( component, constraints );
		add( component );
	}
}
