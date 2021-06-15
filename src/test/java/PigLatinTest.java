
//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class PigLatinTest {
	private PigLatin pig;

	@Before
	public void setup() {
		pig = new PigLatin();
	}

	@Test
	public void testWordStartsWithVowelEndsAy() {
		assertEquals("earay", pig.translate("ear"));
	}

	@Test
	public void testWordStartsWithXrYtEndsAy() {
		assertEquals("xrayay", pig.translate("xray"));
	}

	@Test
	public void testWordStartsWithYtEndsAy() {
		assertEquals("yttriaay", pig.translate("yttria"));
	}

	@Test
	public void testWordStartsWithConsonant() {
		assertEquals("airchay", pig.translate("chair"));
	}

	@Test
	public void testWordStartswisthConstantPlusQU() {
		assertEquals("aresquay", pig.translate("square"));
	}

	@Test
	public void testYAfterConsonant() {
		assertEquals("ymay", pig.translate("my"));
	}

	@Test
	public void testConsonantClusterPlusY() {
		assertEquals("ythmrhay", pig.translate("rhythm"));
	}
}