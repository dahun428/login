package cloudstudying;

import java.util.ArrayList;

class Array {

	public void Array_() {
	
 
		String[] Array1 = new String[5];
		Array1[0] = "���� : 599��";
		Array1[1] = "�λ� : 51 ��";
		Array1[2] = " ��õ : 46 ��";
		Array1[3] = "���� : 43��";
		Array1[4] = "�뱸 : 27��";
 
		for( int i = 0; i < Array1.length; i++) {
		
			System.out.println(Array1[i]);

		}
			}


}
class ArrayList_ {
	
	
	public void Al() {
		 
		
		ArrayList<String> al = new ArrayList<>(); 
		al.add("���� : 599��");
		al.add("�λ� : 51��");
		al.add("��õ : 46��");
		al.add("���� : 43��");
		al.add("�뱸 : 27��");
	
		int totalElements = al.size();
		for (int i = 0; i < totalElements ; i ++) {
			System.out.println(al.get(i));
		}
	 
	
	}
	
	
}
 
class ArrayList__ {
	
	public void ArrayList1(){
		
		
	}
	
}

class map{
	
}

public class pratice47 {

	public static void main(String[] args) {
 
	Array ar = new Array();
	ar.Array_();
	ArrayList_ ar2 = new ArrayList_();
	ar2.Al();
	
	
	
	}

}
