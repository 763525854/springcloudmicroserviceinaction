package github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/index")
	public String index() throws Exception {
		ResponseEntity<String> responseEntity=restTemplate.getForEntity(null, null);
		return "index";

	}
}
