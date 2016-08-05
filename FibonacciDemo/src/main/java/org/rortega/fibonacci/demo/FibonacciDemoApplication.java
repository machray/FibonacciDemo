package org.rortega.fibonacci.demo;

import org.rortega.fibonacci.demo.bean.impl.FibonacciImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FibonacciDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibonacciDemoApplication.class, args);

		FibonacciImpl fibonacciImpl = new FibonacciImpl();
		fibonacciImpl.sequence();
	}
}
