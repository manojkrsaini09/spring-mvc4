package com.manu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manu.model.Event;

@RestController
public class EventReportController {

	@RequestMapping(value="/events")
	public List<Event> getEvents(){
		List<Event> eventList = new ArrayList<Event>();
		Event event1 = new Event();
		event1.setName("event1");
		eventList.add(event1);
		
		Event event2 = new Event();
		event2.setName("event2");
		eventList.add(event2);
		
		Event event3 = new Event();
		event3.setName("event3");
		eventList.add(event3);
		return eventList;
	}
}
