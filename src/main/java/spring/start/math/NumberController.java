package spring.start.math;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * Main controller of the application that contains most of the mapping functions.
 */
@RestController
public class NumberController {
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(String numbers[]) {
		return MathFunction.calcutale(numbers, "add");
	}
	
	@RequestMapping(value = "/subtract", method = RequestMethod.GET)
	public String subtract(String numbers[]) {
		return MathFunction.calcutale(numbers, "sub");
	}

	@RequestMapping(value = "/multiply", method = RequestMethod.GET)
	public String multiply(String numbers[]) {
		return MathFunction.calcutale(numbers, "mult");
	}
	
	@RequestMapping(value = "/divide", method = RequestMethod.GET)
	public String divide(String numbers[]) {
		return MathFunction.calcutale(numbers, "div");
	}
}
