/**
 * 
 */
package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.vo.LectureVO;

/**

  * @FileName : MainDao.java
  * @Date : 2022. 7. 10. 
  * @Author : jsh
  * @Description :
  */
@Mapper
public interface MainDao {
	public List<LectureVO> selectNowLectureInfo();
}
