import static org.junit.Assert.*;

import org.junit.Test;

public class TestLagartija {

	@Test
	public void testLagartija() {
		
		String primero="LAGARTIJA";
		
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner(primero,"LAGARTIJA"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"PAPEL"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"PIEDRA"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"SPOCK"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"TIJERAS"));
	}

}
