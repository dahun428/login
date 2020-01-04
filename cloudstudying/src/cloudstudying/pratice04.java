package cloudstudying;

import java.util.Scanner;

class calculator{
	
	final static double PI = 3.14;
	public static double R;
	public static double H;
	//반지름 , 높이
	public static double surface() {
		return R * R * PI;
		
	}
	// 밑변
	public static double volume() {
		return surface() * H;
	}
	public static double outsidevolume() {
		return surface() * 2 + 2 * R * H * PI;
	}
	
}
public class pratice04 extends calculator{
	
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("높이를 입력하세요 : ");
		H = sc1.nextDouble();
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 : ");
		R = sc2.nextDouble();
		
		sc1.close();
		sc2.close();
		
		
		System.out.println("높이 : " + H);
		System.out.println("반지름 : " + R);
		System.out.println("밑변의 넓이 : " + surface());
		System.out.println("원기둥의 부피 : " + volume());
		System.out.println("원기둥의 겉넓이 : " + outsidevolume());
	}

}
