package testrpg;

import java.io.IOException;

public class StageBattle extends Stage {

	@Override
	public boolean update() {
		try {
			writer.write("전투를 시작합니다.");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void init() {

	}

}
