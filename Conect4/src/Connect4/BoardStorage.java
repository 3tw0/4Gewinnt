package Connect4;

/**
 * Model (model). MVC
 */
public class BoardStorage {

	/** input storage. */
	// vllt brauchen wirs vllt auch net
	static Boolean[][] storage;

	public BoardStorage() {
		storage = new Boolean[7][6];
	}

	/** methode die im array speichert. */
	public void store(int x, int y, Boolean input) {
		storage[x][y] = input;
	}

	/**
	 * Sets all values to false.
	 */
	public void setEmpty() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				storage[i][j] = false;
			}
		}
	}

	/** getter. */
	public Boolean getStorage(int x, int y) {
		return storage[x][y];
	}

}
