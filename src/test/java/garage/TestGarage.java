package garage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // Enables Mockito for this class
public class TestGarage {

	@Mock
	private Scanner scan;

	@InjectMocks
	private Runner run;

	@Test
	void scannerWorks() {
//		for (int i = 3; i >= 0; i--) {
//			Mockito.when(scan.nextInt()).thenReturn(i);
//			if (i == 3)
//				assertEquals(this.test.testScanWithMockito(), new Motorbike(1, 2, "Piaggio", "Vespa"));
//		}
		Mockito.when(scan.nextInt()).thenReturn(3);
		assertEquals(this.run.testScanWithMockito(), new Motorbike(1, 2, "Piaggio", "Vespa"));
		Mockito.verify(this.scan, Mockito.times(4)).nextInt();
	}

}
