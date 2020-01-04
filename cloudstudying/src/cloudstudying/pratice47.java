package cloudstudying;

import java.util.ArrayList;

class Array {

	public void Array_() {
	
 
		String[] Array1 = new String[5];
		Array1[0] = "서울 : 599명";
		Array1[1] = "부산 : 51 명";
		Array1[2] = " 인천 : 46 명";
		Array1[3] = "대전 : 43명";
		Array1[4] = "대구 : 27명";
 
		for( int i = 0; i < Array1.length; i++) {
		
			System.out.println(Array1[i]);

		}
			}


}
class ArrayList_ {
	
	
	public void Al() {
		 
		
		ArrayList<String> al = new ArrayList<>(); 
		al.add("서울 : 599명");
		al.add("부산 : 51명");
		al.add("인천 : 46명");
		al.add("대전 : 43명");
		al.add("대구 : 27명");
	
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
