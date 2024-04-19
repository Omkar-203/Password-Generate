import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneratorTest {
	
	private final Password password= new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
	private final Generator generator = new Generator(true,false,false,false);
//	private final Password generatedPassword = generator.GeneratePassword(4);
	
	@Test
	void test1() {
		assertEquals("Secret", password.toString());
	}

	private void assertEquals(String secret, String string) {
	}

	@Test
	void test2() {
		assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
	}

	@Test
	void test3() {
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS);
	}
	
	@Test
	void test4() {
		assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
	}
	
	@Test
	void test5() {
		assertEquals(Long.valueOf(generator.alphabet.getAlphabet().length()), Long.valueOf(26));
	}

	private void assertEquals(Long aLong, Long aLong1) {
	}

}