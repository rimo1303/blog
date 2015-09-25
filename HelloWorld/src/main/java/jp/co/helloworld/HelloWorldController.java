package jp.co.helloworld;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloworld(Map<String, Object> model) {

		model.put("message", "Hello World!!");

		return "helloworld";
	}

}