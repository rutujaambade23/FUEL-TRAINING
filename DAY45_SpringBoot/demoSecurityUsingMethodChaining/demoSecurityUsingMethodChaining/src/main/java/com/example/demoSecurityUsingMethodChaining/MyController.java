package com.example.demoSecurityUsingMethodChaining;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class MyController{
		@GetMapping("/")
		public String home() {
			String s1="<h1>Hello World!!  Here is Rutuja Ambade</h1>";
			String s2="<br><a href=/logout>Logout</a>";
			return s1+s2;
		}
	}

