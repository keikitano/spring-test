package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	// <form action="/apply" method="post"></form>
	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	public ModelAndView apply(@RequestParam("num") int num, ModelAndView mv) {
		// fizzbuzzの処理をここに記載
		String result = "";
		if (num % 3 == 0 && num!=0) {
			result += "Fizz";
		}
		if (num % 5 == 0&& num!=0) {
			result += "Buzz";
		}
		if (num % 7 == 0&& num!=0) {
			result += "Ass";
		} 
		else {
			result += "Nissy!!";
		}

		// 結果を設定
		mv.addObject("result", result);
		mv.addObject("resulta", result);
		mv.addObject("num", num);
		// 表示するファイルを設定
		mv.setViewName("index");
		return mv;
	}

}
