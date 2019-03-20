package com.zxh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zxh.entity.Admins;
@Mapper
public interface AdminzxhDao {
	public List<Admins> login(Admins admin);
}
 