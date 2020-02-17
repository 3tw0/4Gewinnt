package Connect4;

import java.awt.Color;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

/**
 * bottom description. 
 * präsentation (view) MVC
 */
public class BoardNumbers extends GraphicsProgram {

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

/**
 * Displays the player names in their corresponding color at the bottom of the board.
 */
class PlayerNamesOnBoard extends GraphicsProgram {
	
	private static final int DESCRIPTION_OFFSET = 20;
	
	/**
	 * Constructor
	 * @param player1 player object
	 * @param player2 player object
	 * @param p1 player color
	 * @param p2 player color
	 */
	public PlayerNamesOnBoard(Player player1, Player player2, Color p1, Color p2) {
		
		GLabel name1 = new GLabel(player1.getName());
		name1.setLocation(Connect4Board.OFFSET, Connect4Board.OFFSET * 6 + DESCRIPTION_OFFSET );
		name1.setColor(p1);
		add(name1);
		
		GLabel name2 = new GLabel(player2.getName());
		name1.setLocation(Connect4Board.OFFSET + Connect4Board.SQUARE_SIZE * 7, Connect4Board.OFFSET * 6 + DESCRIPTION_OFFSET );
		name1.setColor(p2);
		add(name2);
	}
	
}
