import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class YearUtilitiesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void yearUtilitiesTrueTest() {
		assertTrue(new YearUtilities().isLeap(2012));
	}
	
	@Test
	public void yearUtilitiesFalseTest() {
		assertFalse(new YearUtilities().isLeap(2010));
	}
	
	@Test
	public void yearUtilitiesTrue400Test() {
		assertTrue(new YearUtilities().isLeap(2000));
	}
	
	@Test
	public void yearUtilitiesFalse100Test() {
		assertFalse(new YearUtilities().isLeap(1900));
	}
}
