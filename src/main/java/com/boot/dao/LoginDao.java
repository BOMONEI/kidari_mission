package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
	public int getMemberFlag(String memberCode) throws Exception;
}
