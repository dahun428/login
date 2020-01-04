import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class Main {

	public static void main(String[] args) {
	
		String id = "JAVA APT 507";
		
		// 엘베 콜
		Elevator myElevator = new Elevator("id");
		myElevator.callForUp(1);
		
		
		// 시큐리티 자동 해제
		Security mySecurity = new Security("id");
		mySecurity.off();
		
		
		
		// 불이 켜져라
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorlamp = new Lighting(id +"/ Floor Lamp");
		floorlamp.on();
		
		
		
	
		
		
	}

}
