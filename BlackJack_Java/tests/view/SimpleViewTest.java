package view;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class SimpleViewTest {

	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void shouldReturnPrinter() {
		PrintStream mockPrinter = mock(PrintStream.class);		
		SimpleView sut = new SimpleView(mockPrinter);
		
		assertNotNull(sut.getPrinter());
	}
}
