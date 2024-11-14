package testrpg;

public class RpgGame {

	private RpgGame() {
	}

	private static RpgGame instance = new RpgGame();

	public static RpgGame getInstance() {
		return instance;
	}
	
	public void run() {}
}
