package Connect4;

import java.awt.Color;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

/**
 * bottom description. 
 * präsentation (view) MVC
 */
public class BoardNumbers extends GraphicsProgram {
//
	/** description offset. */
	private static final int DESCRIPTION_OFFSET = 20;

	/**
	 * Constructor for the bottom numbers / calc location.
	 * @param count column count
	 */
	public BoardNumbers(int count) {
		GLabel bottomNumbers = new GLabel("" + (1 + count));
		bottomNumbers.setLocation(
				Connect4Board.OFFSET + Connect4Board.SQUARE_SIZE * count + Connect4Board.SQUARE_SIZE / 2,
				Connect4Board.OFFSET + (6 * Connect4Board.SQUARE_SIZE) + DESCRIPTION_OFFSET);
		add(bottomNumbers);
	}

}


