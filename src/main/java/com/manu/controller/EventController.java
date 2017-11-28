package com.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manu.model.Event;

@Controller
public class EventController {

	
	@RequestMapping(value="/event" , method = RequestMethod.GET)
	public String displayEventPage(Model model){
	 Event event = new Event();
	 model.addAttribute("event", event);
	 event.setName("Java Group");
	 return "event";
	}
	
	@RequestMapping(value="/event" , method = RequestMethod.POST)
	public String processEvent(@ModelAttribute("event") Event event){
	System.out.println("event"+event);
	 return "redirect:index.jsp";
	}
}
