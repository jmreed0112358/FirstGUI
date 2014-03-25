/**
 * 
 */
package jdesktoppaneandjinternalframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author jmreed
 * 
 */
public class DesktopFrame extends JFrame
{
	private JDesktopPane	theDesktop;

	/**
	 * 
	 */
	public DesktopFrame( )
	{
		super( "Using a JDesktopPane" );
	}

	public void draw( )
	{
		JMenuBar bar = new JMenuBar( );

		JMenu addMenu = new JMenu( "Add" );
		JMenuItem newFrame = new JMenuItem( "Internal Frame" );

		addMenu.add( newFrame );
		bar.add( addMenu );
		setJMenuBar( bar );

		theDesktop = new JDesktopPane( );
		add( theDesktop );

		newFrame.addActionListener( new FrameHandler( ) );
	}

	private class FrameHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			JInternalFrame frame = new JInternalFrame( "Internal Frame", true,
					true, true, true );

			MyJPanel panel = new MyJPanel( );

			frame.add( panel, BorderLayout.CENTER );
			frame.pack( );
			theDesktop.add( frame );
			frame.setVisible( true );
		}
	}
}

class MyJPanel extends JPanel
{
	private static Random	generator	= new Random( );
	private ImageIcon		picture;
	private String			images[]	= {
			"data/1395749808000-Nick-Cannon.jpg",
			"data/1395751967000-Arnold-Schwarzenegger.jpg",
			"data/Most-Dangerous-People-Foods-for-Cats.jpg" };

	public MyJPanel( )
	{
		int randomNumber = generator.nextInt( 3 );
		picture = new ImageIcon( images[randomNumber] );
	}

	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		picture.paintIcon( this, g, 0, 0 );
	}

	public Dimension getPreferredSize( )
	{
		return new Dimension( picture.getIconWidth( ), picture.getIconHeight( ) );
	}
}