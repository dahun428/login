package cloudstudying;

public class pratice82 {

	public static void main(String[] args) {
 
		Songlist sl1 = new Songlist();
		Songlist sl2 = new Songlist();
		Songlist sl3 = new Songlist();
		 
		sl1.Song("별헤는밤", "유재하");
		sl2.Song("비상", "임재범");
		sl3.Song("비밀", "박완규");

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
