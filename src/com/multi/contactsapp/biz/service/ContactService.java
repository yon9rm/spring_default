package com.multi.contactsapp.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.contactsapp.biz.dao.ContactDAO;
import com.multi.contactsapp.biz.domain.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactDAO contactDAO;
	
	public List<Contact> selectAll() {
		return contactDAO.selectAll();
	}
	
	public List<Contact> selectAll(int pageno, int pagesize) {
		return contactDAO.selectAll(pageno, pagesize);
	}
	
	public Contact selectOne(Contact c) {
		return contactDAO.selectOne(c);
	}
	
	public int insert(Contact c) {
		return contactDAO.insert(c);
	}
	
	public int update(Contact c) {
		return contactDAO.update(c);
	}
	
	public int delete(Contact c) {
		return contactDAO.delete(c);
	}
}
