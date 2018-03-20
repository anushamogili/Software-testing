

package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivByZero() {
		(0 ,calc.div(3,0));
	}
	
	@Test
    public void testSin() {
	assertEquals(4, calc.sin());
    }
    @Test
    public void testSqr() {
	assertEquals(4, calc.sqr(16));
    }
    @Test
    public void testMod() {
	assertEquals(0, calc.mod(10, 5));
    }
    @Test
    public void testArea() {
    assertEquals(25.12, calc.area(4);
    }
   
    @Test
    public void testsin() {
    assertEquals(0, calc.sin(0));
    }
    @Test
    public void testcos() {
    assertEquals(1, calc.cos(0));
    }
    @Test
    public void testtan() {
    assertEquals(1, calc.tan(45));
    }
    @Test
    public void testsec() {
    assertEquals(1, calc.sec(0));
    }
    @Test
    public void testlog() {
    assertEquals(0, calc.log(1));
    }
    @Test
    public void testpower() {
    assertEquals(4, calc.power(2,2));
    }
    @Test
    public void testSquare() {
    assertEquals(9, calc.square(3));
    }
    
    //combination of two or three functions
    @Test
    public void testTanUsingSinAndCos() {
    assertTrue("tan()=sin()/cos()",calc.tan(45)==(calc.div(calc.sin(45)/calc.cos(45))));
    }
    @Test
    public void testSecUsingSinAndCos() {
    assertTrue("sec()=cos()/sin()",calc.sec(45)==(calc.div(calc.cos(45)/calc.sin(45))));
    }
    @Test
    public void testSecUsingTan() {
    assertTrue("sec()=1/tan()",calc.sec(45)==(calc.div(1/calc.tan(45))));
    }
    @Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
    @Test
	public void testPresedence() {
		assertNotEquals(35, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
   