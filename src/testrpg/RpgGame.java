package testrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RpgGame {

	private RpgGame() {
	}

	private static RpgGame instance = new RpgGame();

	public static RpgGame getInstance() {
		return instance;
	}
	
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	private boolean isRun = true;
	
	public void run() {
	    GameManager.instance.init();
		while(isRun) {
			isRun = GameManager.instance.changeStage();
			printMenu();
			selectRun();
			
		}
	}

	 private void printMenu() {
	        try {
	            writer.write("[b]전투 [s]설정 [e]종료");
	            writer.flush();
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }
	 
	 private void selectRun() {
	        try {
	            String input = reader.readLine();

	            if (input.equals("b")) {
	              writer.write("전투\n");
	              writer.flush();
	            } else if (input.equals("s")) {
	            	  writer.write("설정\n");
		              writer.flush();
	            } else if (input.equals("e")) {
	            	writer.write("게임을 종료합니다.");
	            	writer.flush();
	            	isRun = false;
	            } else {
	                writer.write("없는 메뉴입니다.\n");
	                writer.flush();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
}
