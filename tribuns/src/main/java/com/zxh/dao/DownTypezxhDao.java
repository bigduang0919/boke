package com.zxh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zxh.entity.Downtype;
@Mapper
public interface DownTypezxhDao {
	public List<Downtype> querydowntype();
}
