package Connect4;

import java.awt.Color;

import acm.graphics.GCanvas;
import acm.program.DialogProgram;

/**
 * Controller for playing the game.
 * 
 * @author elianeiselt
 *
 */
public class TestController extends DialogProgram {

	public void run() {

		// alles in die play game klasse hauen damit besser geht
		
		//Color colorPlayer1;
		//Color colorPlayer2;

		String p1 = readLine("Name Player 1: "); // rot
		String p2 = readLine("Name Player 2: "); // gelb
		
		Player player1 = new Player(p1, Color.RED);
		Player player2 = new Player(p2, Color.YELLOW);
		
		
		//PlayGame game = new PlayGame(player1, player2);
		//game.play();
		
		setSize(900,600);
		new Connect4Board().start();
		// hi
		
		// controller / playGame so implementieren , das while loop im controller ist und immer einfach nur playGame
		// mit dem jeweiligen spieler aufruft, für bessere übersichtlichkeit der playGame klasse
		// und dadurch wird implementieren gespart 
	
	}

	public static void main(String[] args) {
		new TestController().start();
	}
}
