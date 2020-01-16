package ex20_commandPattern;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light ligth) {
		this.light = ligth;
	}
	@Override
	public void execute() {
	light.on();
		
	}
	
}