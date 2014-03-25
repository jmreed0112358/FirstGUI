/**
 * 
 */
package jtextarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author jmreed
 * 
 */
public class TextAreaFrame extends JFrame
{
	private JTextArea	textArea1;
	private JTextArea	textArea2;
	private JButton		copyJButton;

	/**
	 * 
	 */
	public TextAreaFrame( )
	{
		super( "TextArea Demo" );
	}

	public void draw( )
	{
		Box box = Box.createHorizontalBox( );
		String demo = "This is a demo string to\n"
				+ "illustrate copying text\nfrom one textarea to\n"
				+ "another text area using an\nexternal event\n";

		textArea1 = new JTextArea( demo, 10, 15 );
		box.add( new JScrollPane( textArea1 ) );

		copyJButton = new JButton( "Copy >>>" );
		box.add( copyJButton );
		copyJButton.addActionListener( new TextAreaActionHandler( ) );

		textArea2 = new JTextArea( 10, 15 );
		textArea2.setEditable( false );
		box.add( new JScrollPane( textArea2 ) );
		
		add( box );
	}

	private class TextAreaActionHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			textArea2.setText( textArea1.getSelectedText( ) );
		}
	}
}
