package com.kite.mm.guest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;

@Service
public class GuestDeleteService {

	@Autowired
	private SqlSessionTemplate template;

	private GuestDao dao;

	public int deleteArticle(int idx) {
		
		dao = template.getMapper(GuestDao.class);

		return dao.deleteArticle(idx);
	}

}
