package Connect4;

import acm.program.ConsoleProgram;

// noch ein dicker haufen scheiße
// hier sollen mal alle methoden rein um das spiel zu spielen

//ka ob graphics gebraucht wird / eig net
public class PlayGame extends ConsoleProgram {
//
	Player player1;
	Player player2;

	public PlayGame(Player player1, Player player2) {

		this.player1 = player1;
		this.player2 = player2;

	}

	/**
	 * the actual game played.
	 */
	public void play() {

		BoardStorage storage = new BoardStorage();
		storage.setEmpty();

		boolean win = false;
		int start = 0;
		Player atm;

		//verlagern in controller und einfach nur aufruf der play methode mit jeweiligem spieler.
		while (!win) {
			// need:
			// einen input in welcher spalte platziert werden soll
			//
			if (start % 2 == 0) {
				atm = player1;
				int input = readInt();

				atm.addPositionStorage(input);
				winCheck();
			}

			if (start % 2 == 1) {
				atm = player2;

				int input = readInt();
				atm.addPositionStorage(input);
				winCheck();
			}
			start++;
		}
	}

	/**
	 * Win check
	 * 
	 * @return
	 */
	private static boolean winCheck() {
		// aufpasse mit NullPointerExceptions
		return true;
	}

	/**
	 * finds the first empty cell in the input row sucht die erste stelle in der col
	 * in der der spüieler seinen stein platzieren will
	 * 
	 * @param col     the collumn position where the player places his stone
	 * @param storage position array
	 */
	private void placePlayerInArrayAndBoard(int col, Player player, BoardStorage storage) {

		for (int colCount = 6; colCount > 0; colCount--) {
			if (storage.getStorage(colCount, col)) {
				// add player playstone
				
				
				// das ganze array gedöns
				// boolean board storage
				// player hashset
				storage.store(colCount, col, true);
				int posValue = player.findHashValue(colCount, col);
				player.addPositionStorage(posValue);
			}
		}
	}

}
