package cloudstudying;

import java.util.Scanner;

public class pratice23 {
	static int a;
	int b;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 층수를 입력하세요");
		a = sc.nextInt();
		sc.close();
		
	if ( a > 10) {
		System.out.println("고층엘리베이터로 이동합니다.");
		}else {
			System.out.println("저층엘리베이터로 이동합니다.");
				}
		
		
		
		
	}

}
