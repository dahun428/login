package WorkAllba;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateexmpl {

	public static void main(String args[]) {
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat datenow = new SimpleDateFormat("오늘은 " + " yyyy.MM.dd E요일 " + " 입니다.");
		System.out.println(datenow.format(date));
		
		/*
		 * int Today;
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("오늘 날짜를 입력하세요");
		 * Today = sc.nextInt(); SimpleDateFormat Datetoday = new
		 * SimpleDateFormat("오늘은 " + " yyyy.MM.dd E요일 " + " 입니다.");
		 * System.out.println(Datetoday.format(Today));
		 */
		
		String str = String.format("Current Date/Time : %tc",date);
		System.out.println(str);
		
		System.out.printf("%1$s %2$sB %2$td, %2$tY", "Due date:", date);
		System.out.printf("%s %tB %<te, %<tY", "Due Date : ", date);
	}
}
