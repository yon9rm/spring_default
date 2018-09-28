package com.multi.contactsapp.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.multi.contactsapp.biz.domain.Contact;
import com.multi.contactsapp.biz.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView selectAll() { 
		
		List<Contact> contacts = contactService.selectAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list");
		mv.addObject("contacts", contacts);
		return mv;
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insertContact(Contact c) { 
		
		contactService.insert(c);
		return "redirect:list.do";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String updateContact(Contact c) { 
		
		contactService.update(c);
		return "redirect:list.do";
	}
}
