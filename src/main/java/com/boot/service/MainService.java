package com.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.MainDao;
import com.boot.vo.LectureVO;

/**

  * @FileName : MainService.java
  * @Date : 2022. 7. 9. 
  * @Author : jsh
  * @Description : Main Busness Logic
  */

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;
	
	public List<LectureVO> selectNowLectureInfo(){
		List<LectureVO> lectureList = new ArrayList<LectureVO>();
		try {
			//System.out.println(mainDao.selectNowLectureInfo());
			lectureList = mainDao.selectNowLectureInfo();
			//lectureList.add((LectureVO) mainDao.selectNowLectureInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lectureList;
	}
	
}
