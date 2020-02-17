package Connect4;

import java.awt.Color;

import acm.graphics.GLabel;
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

	private static final int DESCRIPTION_OFFSET = 20;

	/**
	 * Constructor for gameboard.
	 */
	public Connect4Board() {

		Player player1 = new Player(readLine("Name Player 1: "), Color.RED);
		Player player2 = new Player(readLine("Name Player 2: "), Color.YELLOW);

		PlayGame.player1 = player1;
		PlayGame.player2 = player2;

		draw(player1, player2);

		// java.lang.IllegalArgumentException: adding a window to a container
		// gleiches gillt für die bottom descritpion
		// add(new PlayerNamesOnBoard(player1, player2, player1.getFillColor(),
		// player2.getFillColor()));
	}

	public void draw(Player player1, Player player2) {

		setBackground(Color.LIGHT_GRAY);

		int x = OFFSET;
		int y = OFFSET;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				x = OFFSET + (i * SQUARE_SIZE);
				y = OFFSET + (j * SQUARE_SIZE);

				add(new DrawElement(SQUARE_SIZE), x, y);
			}
		}

		// größe des labels ändern
		GLabel namePlate1 = new GLabel(PlayGame.player1.getName());
		namePlate1.setLocation(Connect4Board.OFFSET + (SQUARE_SIZE / 4),
				Connect4Board.OFFSET + (SQUARE_SIZE * 6) + DESCRIPTION_OFFSET);
		namePlate1.setColor(PlayGame.player1.getFillColor());
		add(namePlate1);

		GLabel namePlate2 = new GLabel(PlayGame.player2.getName());
		namePlate2.setLocation(Connect4Board.OFFSET + Connect4Board.SQUARE_SIZE * 6 + (SQUARE_SIZE / 4),
				Connect4Board.OFFSET + (SQUARE_SIZE * 6) + DESCRIPTION_OFFSET);
		namePlate2.setColor(PlayGame.player2.getFillColor());
		add(namePlate2);
	}

	public static void main(String[] args) {
		new Connect4Board().start();
	}

}
