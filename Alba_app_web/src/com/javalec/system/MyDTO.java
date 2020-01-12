package com.javalec.system;

public class MyDTO {
	int _id;
	String name;
	int dateY;
	int dateM;
	int dateD;
	int pay;
	String time;
	int hour;
	double min;
	String place;
	String memo;
	double wage;
	double night_wage;
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public double getWage() {
		
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getNight_wage() {
		return night_wage;
	}
	public void setNight_wage(double night_wage) {
		this.night_wage = night_wage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDateY() {
		return dateY;
	}
	public void setDateY(int dateY) {
		this.dateY = dateY;
	}
	public int getDateM() {
		return dateM;
	}
	public void setDateM(int dateM) {
		this.dateM = dateM;
	}
	public int getDateD() {
		return dateD;
	}
	public void setDateD(int dateD) {
		this.dateD = dateD;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
//	public double wage() {
//		return wage = (pay * hour) + (pay * min);
//	}
//	public double night_wage() {
//		return night_wage = 1.5 * (pay * hour) + (pay * min);
//	}
//	
	
	
}
