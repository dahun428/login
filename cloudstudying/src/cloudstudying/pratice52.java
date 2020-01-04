package cloudstudying;

public class pratice52 {

	public static void main(String[] args) {
 
		char []name = "SEHONG".toCharArray();
		printRotation(name);
	}

	private static void printRotation(char[] name) {
		 
		 for (int i = name.length; i >= 0; i--) {
		      for (int j = 0, start = i; j < name.length; j++, start++) {
		        System.out.print(name[start % name.length]);
		      }
		      System.out.println();
		
	}

}}
