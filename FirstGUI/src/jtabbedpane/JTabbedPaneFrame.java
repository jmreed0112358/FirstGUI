/**
 * 
 */
package jtabbedpane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 * @author jmreed
 *
 */
public class JTabbedPaneFrame extends JFrame
{

	/**
	 * 
	 */
	public JTabbedPaneFrame( )
	{
		super( "JTabbedPane Demo" );
	}
	
	public void draw()
	{
		JTabbedPane tabbedPane = new JTabbedPane();
		
		// Set up panel1 and add it to the JTabbedPane
		JLabel label1 = new JLabel( "Panel one", SwingConstants.CENTER );
		JPanel panel1 = new JPanel();
		panel1.add( label1 );
		tabbedPane.addTab( "Tab one", null, panel1, "First Panel" );
		
		// Set up panel2, and add it to the JTabbedPane.
		JLabel label2 = new JLabel( "Panel two", SwingConstants.CENTER );
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.add( label2 );
		tabbedPane.addTab( "Tab two", null, panel2, "Second Panel" );
		
		// Set up panel3 and add it to the JTabbedPane
		JLabel label3 = new JLabel( "Panel three" );
		JPanel panel3 = new JPanel();
		panel3.setLayout( new BorderLayout( ) );
		panel3.add(  new JButton( "North" ), BorderLayout.NORTH );
		panel3.add( new JButton( "West" ), BorderLayout.WEST );
		panel3.add( new JButton( "East" ), BorderLayout.EAST );
		panel3.add( new JButton( "South" ), BorderLayout.SOUTH );
		panel3.add( label3, BorderLayout.CENTER );
		tabbedPane.addTab(  "Tab three", null, panel3, "Third Panel" );
		
		add( tabbedPane );
	}

}
