package com.javalec.ex;

import java.util.Arrays;

public class exx {

	public static void main(String[] args) {
		String[] phone1 = {"010"};
		String phone2,phone3;
		
		phone2 = "4346";
		phone3 = "0429";
		
		String phoneNumber = String.format("%s-%s-%s",Arrays.toString(phone1), phone2, phone3);   
		System.out.println(phoneNumber);
	}

}
