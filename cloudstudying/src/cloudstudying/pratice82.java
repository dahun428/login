package cloudstudying;

public class pratice82 {

	public static void main(String[] args) {
 
		Songlist sl1 = new Songlist();
		Songlist sl2 = new Songlist();
		Songlist sl3 = new Songlist();
		 
		sl1.Song("����¹�", "������");
		sl2.Song("���", "�����");
		sl3.Song("���", "�ڿϱ�");

		Songlist [] songarray = {sl1 , sl2, sl3};
		
		for( int i = 0; i < songarray.length; i ++) {
			System.out.println(songarray[i].str());
			
		}
		
		
		
	}

}

class Songlist{
	
	String song;
	String singer;
	
	public void Song(String song, String singer) {
		
		this.song = song;
		this.singer = singer;
		
	}
	public String str() {
		return String.format("Song { name : %s , singer : %s }", song, singer);
	}
	
	
}
