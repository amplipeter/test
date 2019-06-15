package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)



public class Test2test {
	//@Mock
	//Showme s;
	{System.out.println("vlak voor de mock");}
	Showme s=Mockito.mock(Showme.class);

	
	
	@Test
	public void test() {
		when(s.showPrintln(anyString())).thenReturn("pipo");
		
		String m = s.showPrintln("peter abma");
		System.out.println("mocker de mock" + m);
		assertTrue(m.equals("pipo"));
	}

}
