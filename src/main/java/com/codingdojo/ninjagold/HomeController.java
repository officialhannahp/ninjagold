package com.codingdojo.ninjagold;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	//render
	@RequestMapping("/Gold")
	public String gold(HttpSession session) {
		if(session.isNew()) {
			session.setAttribute("gold", 0);
		}
		return "gold.jsp";
	}
	
	

	
	
	
	//action
	@RequestMapping(value="/findgold", method=RequestMethod.POST)
	public String findgold(HttpSession session, @RequestParam(value="button") String button){
		if(button.equals("farm")) {
			int ranGold = ThreadLocalRandom.current().nextInt(10, 21);
			int currentGold = (int) session.getAttribute("gold");
			currentGold +=ranGold;
			session.setAttribute("gold", currentGold);	
			
		}
			
		if(button.equals("cave")) {
			int ranGold = ThreadLocalRandom.current().nextInt(5,11);
			Integer currentGold = (Integer) session.getAttribute("gold");
			currentGold += ranGold;
			session.setAttribute("gold", currentGold);
		}
			
		if(button.equals("house")) {
			int ranGold = ThreadLocalRandom.current().nextInt(2,6);
			Integer currentGold = (Integer) session.getAttribute("gold");
			currentGold += ranGold;
			session.setAttribute("gold", currentGold);
		}
		
		if (button.equals("casino")) {
			int ranGold = ThreadLocalRandom.current().nextInt(-50,51);
			Integer currentGold =  (Integer) session.getAttribute("gold");
			currentGold += ranGold;
			session.setAttribute("gold", currentGold);
		}
			return "redirect:/Gold";

	}
}





