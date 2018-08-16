package co.grandcircus.coffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CoffeeShopController {

	@RequestMapping ("/coffeeshop-form")
	
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("CoffeeShopForm");
		
		return mav;
	}
	
	@RequestMapping("/coffeeshop-results")
	public ModelAndView showMileageResults (@RequestParam("name")String name, @RequestParam("age")int age, 
			@RequestParam("coffeeCups")int coffeeCups) {
		ModelAndView mav = new ModelAndView("CoffeeShopResults");
		mav.addObject("Name", name);
		mav.addObject("UserAge", age);
		mav.addObject("numCoffeeCups", coffeeCups);
		mav.addObject("Result", name + " is " + age + " years old, and drinks " + coffeeCups + " cups of coffee per day!");
		
		return mav;
	}
	
}
