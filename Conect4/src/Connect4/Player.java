package Connect4;

import java.awt.Color;
import java.util.HashSet;

/**
 * player data class.
 * 
 * @author elianeiselt
 *
 */
public class Player {
//
	private String name;

	private Color fillColor;

	HashSet<Integer> positionStorage = new HashSet<>();

	/**
	 * Constructor.
	 * 
	 * @param name      the players name
	 * @param fillColor the players selected Color
	 */
	public Player(String name, Color fillColor) {

		this.name = name;

		this.fillColor = fillColor;

	}
	
	/**
	 * Name setter.
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Color setter.
	 * @return fillColor
	 */
	public Color getFillColor() {
		return fillColor;
	}

	/**
	 * Name setter.
	 * @param name name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Color setter.
	 * @param fillColor player color
	 */
	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * has set with all player positions.
	 * @return hashset
	 */
	public HashSet getPositionStorage() {
		return positionStorage;
	}

	/**
	 * adds a int to the hashset.
	 * @param n integer to add
	 */
	public void addPositionStorage(int n) {
		positionStorage.add(n);
	}
	
	/**
	 * finds the integer of a given entry in the check array.
	 * @param row the row
	 * @param posInRow the column
	 * @return the integer to add to the players hashset
	 */
	public int findHashValue (int row, int posInRow) {
		// row value muss umgedreht werden da array 0
		// ja oben ist oben aber 5 sein muss für unser board
		
		
		return 1;
	}

	/**
	 * das grafische plazieren des spielsteins.
	 * @param x pos
	 * @param y pos
	 * @param player player atm (only important for the color)
	 */
	public void placePlayer(int x, int y, Player player) {
		Color thisColor = player.getFillColor();
		
		// placer
		// muss noch implementiert werden
		
	}
}
