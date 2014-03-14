package firstgui;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrameTest extends JFrame
{
	private JLabel	labelOne;
	private JLabel	labelTwo;
	private JLabel	labelThree;

	public LabelFrameTest( )
	{
		super( "Testing JLabel" );
	}

	public void draw( )
	{
		setLayout( new FlowLayout( ) );

		// Label One.
		labelOne = new JLabel( "Label with text" );
		labelOne.setToolTipText( "This is labelOne" );
		add( labelOne );

		// Label Two.
		Icon smiley = new ImageIcon( "data/small_smiley_face.jpg" );
		labelTwo = new JLabel( "Label with text and icon", smiley,
				SwingConstants.LEFT );
		labelTwo.setToolTipText( "This is labelTwo" );
		add( labelTwo );

		// Label Three.
		labelThree = new JLabel( );
		labelThree.setText( "Label with icon and text at bottom" );
		labelThree.setIcon( smiley );
		labelThree.setHorizontalTextPosition(  SwingConstants.CENTER );
		labelThree.setVerticalTextPosition(  SwingConstants.BOTTOM );
		labelThree.setToolTipText( "This is labelThree" );
		add( labelThree );
	}

}
