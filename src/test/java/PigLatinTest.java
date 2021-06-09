import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.Before;

public class PigLatinTest {
	private PigLatin pig;

	@Before
	public void setup() {
		pig = new PigLatin();
	}

	@Test
	public void testPigLatinReturnsString() {
		assertEquals("Hello", pig.translate("Hello"));
	}
}