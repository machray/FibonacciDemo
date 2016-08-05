package org.rortega.fibonacci.demo.bean.impl;

import org.rortega.fibonacci.demo.bean.Fibonacci;

public class FibonacciImpl extends Fibonacci {
	
	public FibonacciImpl() {
		setValue1(0);
		setValue2(1);
	}

	public void sequence() {
		if (getValue1() == 0) {
			System.out.println(getValue1());
		}
		System.out.println(getValue2());
		setValue3(getValue1() + getValue2());
		setValue1(getValue2());
		setValue2(getValue3());
		if (getValue1() < 1000000000) {
			sequence();
		}
	}
}
