package cloudstudying;

public class pratice70 {

	public static void main(String[] args) {
		 /* 1. ��ü ���� */
	    /* 2. �ʵ� �ʱ�ȭ(�� ����) */
	    /* 3. ��� ��� */
		Square sq = new Square();
		int n = 4;
		int x = n;
		int y = sq.Area(n);
		
		System.out.printf("�� ���� ���̰�  %d �� ���簢���� ���� : %d", x , y);
	}
	

}
class Square{
	 		
	public int Area(int length) {
	 	
		return length * length;
	}
}

/* 4. ���簢�� Ŭ���� ���� */