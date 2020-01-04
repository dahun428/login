package cloudstudying;

public class pratice81 {

	public static void main(String[] args) {
	
		Book_1 naruto = new Book_1();
		Book_1 onepiece = new Book_1();
		Book_1 slamdunk = new Book_1();
		
		naruto.bk("나루토");
		onepiece.bk("원피스");
		slamdunk.bk("슬램덩크");
		
		Book_1 [] comics = {naruto , onepiece, slamdunk};
		
		
		for(int i = 0; i < comics.length; i++) {
			System.out.println(comics[i].str());
			
		}
			}
	

}

class Book_1{

	String book_name;
	
	public String bk(String bn) {
		this.book_name = bn;
		return book_name;
	}
	
	String str () {
		return String.format("Book { %s }", book_name);
	}
}
