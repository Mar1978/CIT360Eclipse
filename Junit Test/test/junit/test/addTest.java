/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikeg
 */
public class addTest {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int output = test.add(5);
		assertEquals(10, output);
	}

}
