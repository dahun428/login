package cloudstudying;

public class pratice50 {

	
	
	public static void main(String[] args) {
   
		String date = new String("2017-12-04");
		
		String dateElements[] = date.split("-");
		// split 값을 이용해서 dateElements [] 배열값에 입력
		
		System.out.printf("%s년 %s월 %s일\n", dateElements[0], dateElements[1], dateElements[2]);
		// split 배열값에 입력된 값을 호출
		
		  for(int i = 0 ; i < dateElements.length; i++) { if ( 10 >
		  Integer.parseInt(dateElements[i])&& dateElements[i].contains("0")) {
		  dateElements[i] = dateElements[i].replace("0", "");
		  // contain -> 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수.
		  //  Integer.parseInt  -> 문자를 숫자열로 변환시키는 함수
		  // dateElements 의 String 배열 값을 숫자열로 변환시키는 것. 
		  // replace - > 0 값을 빈값으로 교체
		  } }
		 
		System.out.printf("%s. %s. %s.\n",dateElements[0],dateElements[1],dateElements[2]);
		// dateElements 배열 값을 호출.
	}

}
