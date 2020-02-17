package Connect4;

import acm.program.GraphicsProgram;

/**
 * Präsentation (view). MVC
 *
 */
public class Connect4Board extends GraphicsProgram {
//
	/** offset. */
	static final int OFFSET = 75;
	/** size. */
	static final int SQUARE_SIZE = 100;

	/**
	 * Constructor for gameboard.
	 */
	public Connect4Board() {

		// irgendwas hier geht nicht
		// funktioniert wenn eine klasse von dieser erbt

		int x = OFFSET;
		int y = OFFSET;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				x = OFFSET + (i * SQUARE_SIZE);
				y = OFFSET + (j * SQUARE_SIZE);

				add(new DrawElement(SQUARE_SIZE), x, y);
				// BoardStorage.store(i, j , false);
			}

		} // java.lang.IllegalArgumentException: adding a window to a container
			// gleiches gillt für die bottom descritpion
			// add(new PlayerNamesOnBoard(player1, player2, player1.getFillColor(),
			// player2.getFillColor()));
	}

	
	
	
	public static void main(String[] args) {
		new Connect4Board().start();
	}

}
