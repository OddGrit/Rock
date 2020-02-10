package grit.services;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class MathClass {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@RequestParam double[] x) {

		return "The sum of the numbers is... <br><h1>" + String.valueOf(DoubleStream.of(x).sum());
	}
	
	@RequestMapping(value = "/mult", method = RequestMethod.GET)
	public String mult(@RequestParam double[] x) {
		
		double tot = 1;
		
		for (double i : x) {
			tot *= i;
		}
		
		return "The product of the numbers is... <br><h1>" + String.valueOf(tot);
	}
	
	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public String div(@RequestParam double[] x) {
		return Double.toString(x[0] / x[1]);
	}
	
	@RequestMapping(value = "/math", method = RequestMethod.GET)
	public String math(@RequestParam String sign, @RequestParam double[] x) {
		switch (sign) {
		case "1":
			return add(x);
		case "2":
			return mult(x);
		case "3":
			return div(x);
		}
		
		return "";
	}

}