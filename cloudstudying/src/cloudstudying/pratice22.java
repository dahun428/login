package cloudstudying;

public class pratice22 {
	  public static void main(String[] args) {
	    // 변수 생성
	    double tomVocal = 8.8;
	    double tomDance = 7.6;
	    double kateVocal = 9.2;
	    double kateDance = 7.8;
	    
	    // 결과 출력
	    System.out.printf("Tom의 오디션 결과: %s\n", result(tomVocal, tomDance));
	    System.out.printf("Kate의 오디션 결과: %s\n", result(kateVocal, kateDance));
	  }

	  // 보컬과 댄스 성적을 토대로 결과 문자열을 반환
	  public static String result(double vocal, double dance) {
	    return ((vocal * dance) >=70) ? "합격": "불합격";
	  }  
	}
//삼항 연산자의 구조
//(조건식) ? 참의 반환값 :  거짓의 반환값;
//string result = (score >= 60) ? "Passed" : "Failed";
