package rps;

public class Runner {

	// public static RPSSimulator theGame = new RPSSimulator();

	public static void main(String[] args) {
		RPSSimulator theGame = new RPSSimulator();
		for (int i = 0; i < 1000; i++) {
			System.out.println(theGame.play(RockPaperScissors.SCISSORS));
		}
	}

}