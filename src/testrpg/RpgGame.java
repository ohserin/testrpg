package testrpg;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class RpgGame {

	private RpgGame() {
	}

	private static RpgGame instance = new RpgGame();

	public static RpgGame getInstance() {
		return instance;
	}
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public void run() {
		printMenu();
	}

	 private void printMenu() {
	        try {
	            writer.write("[1]전투 [2]설정 [3]종료");
	            writer.flush();
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }
}
