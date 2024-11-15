package testrpg;

public class Player extends Unit {
	
	public static int money;
	
//	public Guild guild = new Guild();

	public Player(String name, int level, int maxhp, int att, int def, int exp) {
		super(name, level, maxhp, att, def, exp);
	}

	public Player(String name, int level, int maxhp, int att, int def, int exp, boolean party) {
		super(name, level, maxhp, att, def, exp, false);
	}

}
