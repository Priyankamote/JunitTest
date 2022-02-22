package Com.accenture.tetcase;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
	import org.junit.jupiter.params.provider.CsvSource;

	class FiboTest {


	public static Fibo test;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	    test = new Fibo();
	}

	@ParameterizedTest
	@DisplayName("Testing Fib_No")
	@CsvSource({
	                "1,0",
	                "2,1",
	                "3,1",
	                "4,2",
	                "8,13",
	                "14,233"                   
	})
	void testFib_No(int pos, int fibno) {
	   // assertEquals(fibno,test.Fib_No(pos));
	}
	}


