package ex05_overriding;

public class ComputerMain {
	public static void main(String[] args) {
		Samsong s = new Samsong();
		s.powerOn();
		s.powerOff();
		
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();
	}
}
