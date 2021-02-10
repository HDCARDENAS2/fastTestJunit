package com.fastTestJunit.service.impl;

import com.fastTestJunit.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public int sum(int fristNumber, int secondNumber) {
		return fristNumber + secondNumber;
	}

}
