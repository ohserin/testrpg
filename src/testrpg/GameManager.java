package testrpg;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class GameManager {

	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	private GameManager() {
	}

	public static GameManager instance = new GameManager();

	public static GameManager getInstance() {
		return instance;
	}

	private static String nextStage;

	public static String getNextStage() {
		return nextStage;
	}

	public static void setNextStage(String stage) {
		nextStage = stage;
	}

	Map<String, Stage> stageList = new HashMap<>();
	private String curStage = "";

	public void init() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("LOBBY", new StageLobby());
		stageList.put("BATTLE", new StageBattle());
		nextStage = "TITLE";
	}

	public boolean changeStage() {
		try {
			writer.write("🔺 : " + curStage);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();

		}
		try {
			writer.write("🔻 : " + nextStage);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();

		}

		if (curStage.equals(nextStage)) {
			return true;
		}

		curStage = nextStage;
		Stage stage = stageList.get(curStage);
		stage.init();

		boolean run = true;
		while (run) {
			run = stage.update();
			if (run == false)
				break;
		}

		return true;

	}

}
