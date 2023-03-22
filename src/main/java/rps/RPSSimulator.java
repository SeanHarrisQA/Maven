package rps;

import java.util.Random;

public class RPSSimulator {

	private Random rand = new Random();

	public String play(RockPaperScissors playerCall) {
		int genPcAnswer = this.rand.nextInt(3);
		RockPaperScissors pcCall;
		if (genPcAnswer == 0) {
			pcCall = RockPaperScissors.ROCK;
		} else if (genPcAnswer == 1) {
			pcCall = RockPaperScissors.PAPER;
		} else {
			pcCall = RockPaperScissors.SCISSORS;
		}
		System.out.println(pcCall);
		if (pcCall == playerCall) {
			return "Nobody wins";
		} else if ((pcCall == RockPaperScissors.SCISSORS && playerCall == RockPaperScissors.PAPER)
				|| (pcCall == RockPaperScissors.PAPER && playerCall == RockPaperScissors.ROCK)
				|| (pcCall == RockPaperScissors.ROCK && playerCall == RockPaperScissors.SCISSORS)) {
			return "You lose";
		} else {
			return "You WIN!!!";
		}
	}

}