package com.cjt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjt.entity.Bbscomment;
import com.cjt.entity.Bbstype;
import com.cjt.entity.Userinfo;
import com.cjt.service.BbsService;
import com.cjt.service.BbstypeService;

@Controller
public class BbstController {

	
	@Autowired
	BbsService service;
	
	@Autowired
	BbstypeService typeserice;
	
	@RequestMapping("bs")
	public String querybbs(Model model,Integer parentid){
		//查询帖子
       List<Map<String, Object>> map = service.querybbs();
       model.addAttribute("map", map);
       //推荐帖子
       List<Map<String, Object>> mapt = service.queryTbbs();
       model.addAttribute("mapt", mapt);
       //根据id查询论坛类型
       
       List<Bbstype> list = typeserice.querytype(parentid);
	   model.addAttribute("list", list);
       //查询积分
       List<Userinfo> listig = service.queryIntegral();
	   model.addAttribute("listig", listig);
       //查询论坛类型下一级
       List<Bbstype> listTwo = service.querytypeTwo(parentid);
	   model.addAttribute("listTwo", listTwo);
	 
		return "bbs";
	}
	
	@RequestMapping("ment")
	public String querybbscomment(Model model,Integer userid,Integer bbsid){
		//查询论坛评论
		Userinfo u = new Userinfo();
		List<Map<String,Object>> map = service.querybbscomment(bbsid);
		model.addAttribute("map", map);
		//查询论坛表
		List<Map<String,Object>> list = service.querybbst(bbsid);
		model.addAttribute("list", list);
		return "Bbspost";
	}
	@RequestMapping("blog")
	public String quertyblog(Integer userid,Model model){
		List<Map<String,Object>> map = service.queryblog(userid);
		model.addAttribute("map", map);
		return "Original";
	}
	
	@RequestMapping("run")
	public String queryRanking(Model model,Integer userid){
		 List<Userinfo> list = service.queryIntegral();
		 List<Map<String,Object>> map = service.queryblog(userid);
		 model.addAttribute("listc", list);
		 model.addAttribute("mapb", map);
		return "Ranking";
	}
	@RequestMapping("addComent")
	public String addComment(Bbscomment b){
		service.addComment(b);
		return "redirect:ment?userid=1";
	}
	
}
