import static org.junit.Assert.*;

import org.junit.Test;

public class TestPapel {

	@Test
	public void testPapel() {
		
		String primero="PAPEL";
		
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner(primero,"PAPEL"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"PIEDRA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"TIJERAS"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner(primero,"SPOCK"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner(primero,"LAGARTIJA"));
	}
	

}
