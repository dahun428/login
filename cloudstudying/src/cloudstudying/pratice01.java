package cloudstudying;


class Book{
	
	private String bname;
	private String bwriter;
	private int bprice;
	
	
	public Book(String bname, String bwriter, int bprice) {
		
		this.bname = bname;
		this.bwriter = bwriter;
		this.bprice = bprice;
		
		
	}
	public void ShowInfo(){
		
		System.out.println(" 도서명  : " + bname);
		System.out.println(" 작가  : " + bwriter);
		System.out.println(" 가격 : " + bprice);
		
	}
	
}

public class pratice01 {


	
	public static void main(String[] args) {

		Book b1 = new Book("나루토 1권", "키시모토 마사시", 4000);
		b1.ShowInfo();
		
		
	}

}
