package cloudstudying;

import java.util.Scanner;

class calculator{
	
	final static double PI = 3.14;
	public static double R;
	public static double H;
	//������ , ����
	public static double surface() {
		return R * R * PI;
		
	}
	// �غ�
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
		System.out.println("���̸� �Է��ϼ��� : ");
		H = sc1.nextDouble();
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ��� : ");
		R = sc2.nextDouble();
		
		sc1.close();
		sc2.close();
		
		
		System.out.println("���� : " + H);
		System.out.println("������ : " + R);
		System.out.println("�غ��� ���� : " + surface());
		System.out.println("������� ���� : " + volume());
		System.out.println("������� �ѳ��� : " + outsidevolume());
	}

}
