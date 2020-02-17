package com.school.info;


public class School {
	private String schoolName;
	private String schoolPhoneNo;
	private String schoolAddress;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolPhoneNo() {
		return schoolPhoneNo;
	}

	public void setSchoolPhoneNo(String schoolPhoneNo) {
		this.schoolPhoneNo = schoolPhoneNo;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolPhoneNo=" + schoolPhoneNo + ", schoolAddress="
				+ schoolAddress + "]";
	}



}