package com.zxh.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.dao.DownTypezxhDao;
import com.zxh.entity.Downtype;

@Service
public class DownTypezxhService {
	@Autowired(required=true)
	DownTypezxhDao downtypedao;
	
	public List<Downtype> queryDowntype(){
		return downtypedao.querydowntype();
	}
}
