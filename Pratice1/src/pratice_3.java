
public class pratice_3 {
	
	static int totalsec, hour, min, sec;
	
	
	public static void mstime () {
		
		hour = ((totalsec / 60) / 60) %60;
		min = (totalsec / 60) % 60;
		sec = totalsec % 60;
		
		System.out.println( hour +"��"+ min + "��" + sec + "��  �Դϴ�.");
		
	}
	
	 public static void main(String[] args) {
		    
		 totalsec = 7582;
		 pratice_3.mstime();
		 
		  }
}
