package cloudstudying;

public class pratice70 {

	public static void main(String[] args) {
		 /* 1. 객체 생성 */
	    /* 2. 필드 초기화(값 변경) */
	    /* 3. 결과 출력 */
		Square sq = new Square();
		int n = 4;
		int x = n;
		int y = sq.Area(n);
		
		System.out.printf("한 변의 길이가  %d 인 정사각형의 넓이 : %d", x , y);
	}
	

}
class Square{
	 		
	public int Area(int length) {
	 	
		return length * length;
	}
}

/* 4. 정사각형 클래스 구현 */