package co.grandcircus.coffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 

public class AdminController {
	
	@Autowired
	ItemDao itemDao;

	@RequestMapping("/item")
	
	public ModelAndView showAdminPage() {
		List<Items>items = itemDao.findAll();
		return new ModelAndView ("CoffeeShopResults","items", items); 
		}
	
	@RequestMapping("/item/{id}/update")
	public ModelAndView EditPage (@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("EditItem");
		mav.addObject("item", itemDao.findById(id));
		mav.addObject("title", "Edit Food");
		return mav;
	}	
	
	@RequestMapping(value="/item/{id}/update", method=RequestMethod.POST)
	public ModelAndView submitEditPage (Items item, @PathVariable("id") Long id) {
		item.setId(id);
		itemDao.update(item);
		return new ModelAndView("redirect:/item");
	}	
	
	@RequestMapping("/item/{id}/delete")
	public ModelAndView delete(@PathVariable("id") Long id) {
		itemDao.delete(id);
		return new ModelAndView("redirect:/item");
	}
		
}


