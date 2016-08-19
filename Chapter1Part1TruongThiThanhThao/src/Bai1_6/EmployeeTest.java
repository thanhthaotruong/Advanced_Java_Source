package Bai1_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testSalary1() {
		Employee e = new Employee("An", 1260000, 2.67, 1, 12000000);
		double ex = 15225990;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}

}
