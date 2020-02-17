package Connect4;

public class TestController {

	public static void main(String[] args) {

		// alles in die play game klasse hauen damit besser geht

		PlayGame game = new PlayGame();
		
		System.out.println(PlayGame.player1.getFillColor());
		System.out.println(PlayGame.player2.getFillColor());

		
		
		// das nur um das booelan array zu checken
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println(PlayGame.storage.getStorage(i, j));
			}
		}
	}

}
