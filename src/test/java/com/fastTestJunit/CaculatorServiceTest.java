package com.fastTestJunit;

import org.junit.Assert;
import org.junit.Test;

import com.fastTestJunit.service.CalculatorService;
import com.fastTestJunit.service.impl.CalculatorServiceImpl;

public class CaculatorServiceTest {

	@Test
	public void test() {
		
		CalculatorService calculatorService = new  CalculatorServiceImpl();
		int result = calculatorService.sum(1, 1);
		Assert.assertEquals(2,result);

	}

}
