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
		
		System.out.println(" ������  : " + bname);
		System.out.println(" �۰�  : " + bwriter);
		System.out.println(" ���� : " + bprice);
		
	}
	
}

public class pratice01 {


	
	public static void main(String[] args) {

		Book b1 = new Book("������ 1��", "Ű�ø��� �����", 4000);
		b1.ShowInfo();
		
		
	}

}
