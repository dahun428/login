package ex20_commandPattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand ligthOn = new LightOnCommand(light);
		
		remote.setCommand(ligthOn);
		remote.buttonPressed();
	}

}
