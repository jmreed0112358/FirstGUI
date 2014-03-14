package firstgui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrameTest extends JFrame
{
	private JTextField textFieldOne;
	private JTextField textFieldTwo;
	private JTextField textFieldThree;
	private JPasswordField passwordField;
	
	public TextFieldFrameTest( )
	{
		super( "Testing JTextField and JPasswordField" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );
		
		textFieldOne = new JTextField( 10 );
		add( textFieldOne );
		
		textFieldTwo = new JTextField( "Enter text here" );
		add( textFieldTwo );
		
		textFieldThree = new JTextField( "Uneditable text field", 21 );
		textFieldThree.setEditable( false );
		add( textFieldThree );
		
		passwordField = new JPasswordField( "Hidden text" );
		add( passwordField );
		
		// Event handlers.
		TextFieldHandler handler = new TextFieldHandler();
		textFieldOne.addActionListener( handler );
		textFieldTwo.addActionListener( handler );
		textFieldThree.addActionListener( handler );
		passwordField.addActionListener( handler );
	}
	
	private class TextFieldHandler implements ActionListener
	{

		@Override
		public void actionPerformed( ActionEvent event )
		{
			String string = "";
			
			if ( event.getSource() == textFieldOne )
			{
				string = String.format( "textFieldOne: %s", event.getActionCommand( ) );
			}
			else if ( event.getSource() == textFieldTwo )
			{
				string = String.format(  "textFieldTwo: %s", event.getActionCommand( ) );
			}
			else if ( event.getSource() == textFieldThree )
			{
				string = String.format( "textFieldThree: %s", event.getActionCommand( ) );
			}
			else if ( event.getSource() == passwordField )
			{
				string = String.format( "passwordField: %s", new String( passwordField.getPassword( ) ) );
			}
			
			JOptionPane.showMessageDialog( null, string );
		}
		
	}
}
