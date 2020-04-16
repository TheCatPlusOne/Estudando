import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CpfCollectorTest {

	@Test
	void testTemHifen() {
		String cpf = "1111-1111";
		String expected = "-";
		String actual;
		
		actual = CpfCollector.temHifen(cpf);
		
		assertEquals(expected, actual);
	}
}
