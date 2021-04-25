import static org.junit.Assert.*;

import org.junit.Test;

public class TestPiedra {

	@Test
	public void testPiedra() {
		
		String primero="PIEDRA";
		
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner(primero,"PIEDRA"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"TIJERAS"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"PAPEL"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"LAGARTIJA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"SPOCK"));
	}

}
