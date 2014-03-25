/**
 * 
 */
package slidertest;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author jmreed
 * 
 */
public class OvalPanel extends JPanel
{
	private int	diameter	= 10;

	/**
	 * 
	 */
	public OvalPanel( )
	{
	}

	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );

		g.fillOval( 10, 10, diameter, diameter );
	}

	public void setDiameter( int newDiameter )
	{
		diameter = ( newDiameter >= 0 ) ? newDiameter : 10;

		repaint( );
	}

	// Used by the layout manager.
	public Dimension getPreferredSized( )
	{
		return new Dimension( 200, 200 );
	}

	// Used by the layout manager.
	public Dimension getMinimumSize( )
	{
		return getPreferredSize( );
	}
}
