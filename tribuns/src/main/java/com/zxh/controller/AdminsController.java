package com.zxh.controller;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxh.entity.Admins;
import com.zxh.service.AdminzxhService;
@Controller
@RequestMapping("admins")
public class AdminsController {
	@Resource
	AdminzxhService admins;
	@RequestMapping("/login")
	@ResponseBody
	public Integer query(Admins admin){
		List<Admins> query = admins.login(admin);
		if(query.size()==1){
			return 1;
		}else{
		return 0;
		}
	}
	
}
