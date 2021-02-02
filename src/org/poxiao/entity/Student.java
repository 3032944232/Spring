package org.poxiao.entity;

public class Student {
	private int stuNO;
	private String stuName;
	private int stuAge;
	private int cardId;
	public Student() {
	
	}
	public Student(int stuNO, String stuName, int stuAge, int cardId) {
		this.stuNO = stuNO;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.cardId = cardId;
	}
	public int getStuNO() {
		return stuNO;
	}
	public void setStuNO(int stuNO) {
		this.stuNO = stuNO;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	@Override
	public String toString() {
		return "Student [stuNO=" + stuNO + ", stuName=" + stuName + ", stuAge=" + stuAge + ", cardId=" + cardId + "]";
	}
	
	
	
}
