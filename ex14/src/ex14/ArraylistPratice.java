package ex14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistPratice {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		System.out.println(al);
		al.add(1,2);
		System.out.println(al);
		System.out.println("for");
		for(int i = 0 ; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("iterator");
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
			int v = (int)i.next();
			System.out.println(v);
		}
		System.out.println("forin");
		for(int v : al) {
			System.out.println(v);
		}
	}

}
