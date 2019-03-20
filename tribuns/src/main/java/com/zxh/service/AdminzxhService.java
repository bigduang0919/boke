package com.zxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.dao.AdminzxhDao;
import com.zxh.entity.Admins;



@Service
public class AdminzxhService {
	
	@Autowired(required=true)
	AdminzxhDao userdao;
	
	public List<Admins> login(Admins admin){
		return userdao.login(admin);
	}
}
