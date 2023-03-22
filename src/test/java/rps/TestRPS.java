package rps;

import static org.junit.jupiter.api.Assertions.assertEquals; // staatic imports kinda finnicky sometimes

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // Enables Mockito for this class
public class TestRPS {

	// Set up random variable we need to run the tests
	@Mock
	private Random rand;

	@InjectMocks
	private RPSSimulator simulator;

	@Test
	void testRockDraw() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		for (int i = 0; i < 1000; i++)
			assertEquals(this.simulator.play(RockPaperScissors.ROCK), "Nobody wins");
		Mockito.verify(this.rand, Mockito.times(1000)).nextInt(3);
	}

	/// Do these same tests again
}
