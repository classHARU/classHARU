<<<<<<< HEAD
package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
<<<<<<< HEAD
	@GetMapping("main/main.do")
	public String main_main() {
		return "main";
=======
	public static void main(String[] args) {
		System.out.println("dd");
		System.out.println("test");
>>>>>>> refs/remotes/origin/master
	}
=======
package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("main/main.do")
	public String main_main() {
		return "main";
	}
>>>>>>> refs/remotes/origin/main
}