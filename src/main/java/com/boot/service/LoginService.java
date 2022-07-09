package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	private LoginDao mainDao;
	
	public int getMemberFlag(String memberCode) {
		int memberFlagCount = 0;
		try {
			memberFlagCount = mainDao.getMemberFlag(memberCode);
		} catch (Exception e) {
			System.out.println("getMemberFlag ServiceException");
			e.printStackTrace();
		}
		return memberFlagCount;
	}
}
