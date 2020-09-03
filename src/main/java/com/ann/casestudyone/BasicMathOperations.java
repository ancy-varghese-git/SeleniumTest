package com.ann.casestudyone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicMathOperations {
	private static final Logger log = LoggerFactory.getLogger(BasicMathOperations.class);

	@GetMapping("/isEven/{number}")
	public boolean isEvenNumber(@PathVariable int number){
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
	
	@GetMapping("/isOdd/{number}")
	public boolean isOddNumber(@PathVariable int number){
        boolean result = true;
        if(number%2 == 0){
            result = false;
        }
        return result;
    }
	
	@GetMapping("/doubleNumber/{num}")
	public int doubleNumber(@PathVariable int num) {
        return num * 2;
    }
	
	@GetMapping("/squareRoot/{num}")
	public double squareRoot(@PathVariable int num) {
        return Math.sqrt(num);
    }
	
	@GetMapping("/powerOf/{num}/{power}")
	public double powerOf(@PathVariable int num,@PathVariable int power) {
        return Math.pow(num, power);
    }
	
	@GetMapping("/mod/{num1}/{num2}")
	public double mod(@PathVariable int num1,@PathVariable int num2) {
        return (num1 % num2);
    }
	
	@GetMapping("/add/{num1}/{num2}")
	public double add(@PathVariable int num1,@PathVariable int num2) {
        return (num1 + num2);
    }
	
	@GetMapping("/sub/{num1}/{num2}")
	public double subtract(@PathVariable int num1,@PathVariable int num2) {
        return (num1 - num2);
    }
	
	@GetMapping("/multiply/{num1}/{num2}")
	public double multiply(@PathVariable int num1,@PathVariable int num2) {
        return (num1 * num2);
    }
	
	@GetMapping("/divide/{num1}/{num2}")
	public double divide(@PathVariable int num1,@PathVariable int num2) {
        return (num1 / num2);
    }
	

}
