package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testtest {

	@Test
	public void test() {
		Showme s = new Showme();
		assertEquals(s.showPrintln("abc"),"ABC");
	}

}
