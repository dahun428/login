package cloudstudying;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class pratice72 {

	public static void main(String[] args) {
	
		
		/*
		 * 
		 * Bread bread1 = new Bread(); bread1.Breadname = "��"; bread1.price = 600;
		 * System.out.println(bread1.info());
		 * 
		 * Bread bread2 = new Bread(); bread2.Breadname = "��ä"; bread2.price = 700;
		 * System.out.println(bread2.info());
		 * 
		 * Bread bread3 = new Bread(); bread3.Breadname = "����"; bread3.price = 900;
		 * System.out.println(bread3.info());
		 */
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("��", 600);
		map.put("��ä", 700);
		map.put("����", 900);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);

			System.out.printf("%s ȣ�� : %d ��\n" , key, value);
		} 
	}
}

class Bread{
	
	String Breadname;
	int price;
	
	String info() {
		return String.format("%s ȣ�� : %d ��", Breadname, price);
	}
}
