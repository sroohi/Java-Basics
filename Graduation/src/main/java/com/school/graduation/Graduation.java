package com.school.graduation;

import java.util.Map;

import com.school.info.School;

public class Graduation {
	private String studentName;
	private Integer studentId;
	private String isApproved;
	private Map<String, School> schoolAttenders;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public Map<String, School> getSchoolAttenders() {
		return schoolAttenders;
	}

	public void setSchoolAttenders(Map<String, School> schoolAttenders) {
		this.schoolAttenders = schoolAttenders;
	}

	@Override
	public String toString() {
		return "Graduation [studentName=" + studentName + ", studentId=" + studentId + ", isApproved=" + isApproved
				+ ", schoolAttenders=" + schoolAttenders + "]";
	}

}
