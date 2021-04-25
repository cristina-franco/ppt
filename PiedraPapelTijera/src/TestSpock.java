import static org.junit.Assert.*;

import org.junit.Test;

public class TestSpock {

	@Test
	public void testSpock() {
		
		String primero="SPOCK";
		
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner(primero,"SPOCK"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"TIJERAS"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"PAPEL"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"PIEDRA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"LAGARTIJA"));
	}

}
