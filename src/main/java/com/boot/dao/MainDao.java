package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainDao {
	public int getMemberFlag(String memberCode) throws Exception;
}
