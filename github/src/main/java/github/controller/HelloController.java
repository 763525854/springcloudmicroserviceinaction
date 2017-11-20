package github.controller;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/index")
	public String index() throws Exception {
		return "index";

	}
}
