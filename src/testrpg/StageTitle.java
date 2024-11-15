package testrpg;

import java.io.IOException;

public class StageTitle extends Stage {

	@Override
	public boolean update() {
		try {
			writer.write("==== TEST RPG ====\n");
			writer.write("★★★ GAME PLAY ★★★\n");
			writer.write("시작을 입력하세요 >>>\n");
			writer.flush();

			String start = reader.readLine();

			if (!start.equals("시작")) {
				writer.write("시작을 입력하세요! ヽ(･∀･)ﾉ \n");
				writer.flush();
				return true;
			}
			GameManager.setNextStage("LOBBY");
			GameManager.getInstance().changeStage();
			return false;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void init() {
	}
}
