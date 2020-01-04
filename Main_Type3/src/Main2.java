import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class Main2 {

	//paramater 매개변수
	public static void main(String[] args) {
	
		String id = args[0]; 
	    String bright = args[1];
	    
		
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
		
		DimmingLights moodLamp = new DimmingLights(id + "moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	
		
		
	}

}
