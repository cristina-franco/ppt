import static org.junit.Assert.*;

import org.junit.Test;

public class TestTijeras {

	
	@Test
	public void testTijeras() {
		
		String primero="TIJERAS";
		
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner(primero,"TIJERAS"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"PAPEL"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"PIEDRA"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"LAGARTIJA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"SPOCK"));
	}
	
	
}
