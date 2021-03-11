package spring.start.math;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * Custom error handler for the application.
 */
@Controller
public class CustomErrorController implements ErrorController{
	
	/*
	 * Mapping a custom function to /error that sends a HTML response.
	 */
	@RequestMapping("/error")
	@ResponseBody
	public String error() {		
		return "<h2>Error, not a valid request!</h2>"
				+ "<h3>Examples of valid requests are:</h3>"
				+ "<p>/add?numbers=3,4,3</p>"
				+ "<p>/subtract?numbers=10,5,3</p>"
				+ "<p>/multiply?numbers=3,2,2</p>"
				+ "<p>/divide?numbers=12,2,3</p>";
	}

	/*
	 * Override function of getErrorPath to find the custom function.
	 */
	@Override
	public String getErrorPath() {
	    return "/error";
	}
}
