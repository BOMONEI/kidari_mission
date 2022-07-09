/**
 * 
 */
package com.boot.vo;

/**

  * @FileName : LectureVO.java
  * @Date : 2022. 7. 9. 
  * @Author : jsh
  * @Description : 강연데이터 
  */
public class LectureVO {
	private int lectureNo;
	private String lectureName;
	private String lectureMemberName;
	private String lectureDttm;
	private int lectureMemberLimit;
	/**
	 * @return the lectureCode
	 */
	public int getLectureCode() {
		return lectureNo;
	}
	/**
	 * @param lectureCode the lectureCode to set
	 */
	public void setLectureCode(int lectureNo) {
		this.lectureNo = lectureNo;
	}
	/**
	 * @return the lectureName
	 */
	public String getLectureName() {
		return lectureName;
	}
	/**
	 * @param lectureName the lectureName to set
	 */
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	/**
	 * @return the lectureMemberName
	 */
	public String getLectureMemberName() {
		return lectureMemberName;
	}
	/**
	 * @param lectureMemberName the lectureMemberName to set
	 */
	public void setLectureMemberName(String lectureMemberName) {
		this.lectureMemberName = lectureMemberName;
	}
	/**
	 * @return the lectureDttm
	 */
	public String getLectureDttm() {
		return lectureDttm;
	}
	/**
	 * @param lectureDttm the lectureDttm to set
	 */
	public void setLectureDttm(String lectureDttm) {
		this.lectureDttm = lectureDttm;
	}
	/**
	 * @return the lectureMemberLimit
	 */
	public int getLectureMemberLimit() {
		return lectureMemberLimit;
	}
	/**
	 * @param lectureMemberLimit the lectureMemberLimit to set
	 */
	public void setLectureMemberLimit(int lectureMemberLimit) {
		this.lectureMemberLimit = lectureMemberLimit;
	}
	@Override
	public String toString() {
		return "LectureVO [lectureNo=" + lectureNo + ", lectureName=" + lectureName + ", lectureMemberName="
				+ lectureMemberName + ", lectureDttm=" + lectureDttm + ", lectureMemberLimit=" + lectureMemberLimit
				+ "]";
	}
	
	
}
