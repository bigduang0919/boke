package com.zxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.dao.BlogTypezxhDao;
import com.zxh.entity.BlogType;

@Service
public class BlogTypezxhService {
	@Autowired(required=true)
	BlogTypezxhDao blogtypedao;
	
	public List<BlogType> queryblogtype(){
		return blogtypedao.queryblogtype();
	}
}
