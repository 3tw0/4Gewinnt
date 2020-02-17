package Connect4;

// noch ein dicker haufen scheiße
// hier sollen mal alle methoden rein um das spiel zu spielen

//ka ob graphics gebraucht wird / eig net
public class PlayGame {

	static BoardStorage storage;

	static Player player1;
	static Player player2;

	public PlayGame() {
		storage = new BoardStorage(7, 6);
		storage.setEmpty();
		new Connect4Board().start();
	}

	/**
	 * the actual game played.
	 */
	public void play() {

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

		// hab grad keine ahnung mehr wie das funktioniert
		// und was es genau macht
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
