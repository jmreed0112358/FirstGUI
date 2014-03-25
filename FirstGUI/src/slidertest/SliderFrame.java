/**
 * 
 */
package slidertest;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author jmreed
 * 
 */
public class SliderFrame extends JFrame
{
	private JSlider		diameterJSlider;
	private OvalPanel	myPanel;

	/**
	 * 
	 */
	public SliderFrame( )
	{
		super( "Slider Demo" );
	}

	public void draw( )
	{
		myPanel = new OvalPanel( );
		myPanel.setBackground( Color.YELLOW );

		diameterJSlider = new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
		diameterJSlider.setMajorTickSpacing( 10 );
		diameterJSlider.setPaintTicks( true );
		diameterJSlider.addChangeListener( new SliderChangeHandler( ) );

		add( diameterJSlider, BorderLayout.SOUTH );
		add( myPanel, BorderLayout.CENTER );
	}

	private class SliderChangeHandler implements ChangeListener
	{
		@Override
		public void stateChanged( ChangeEvent event )
		{
			myPanel.setDiameter( diameterJSlider.getValue( ) );
		}
	}
}
