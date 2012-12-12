import processing.core.PApplet;
import cc.arduino.Arduino;

public class FirmataPApplet extends PApplet {
	Arduino arduino;
	int pin = 13;

	public void setup(){
		size(470, 200);
		println(Arduino.list());
		arduino = new Arduino(this, Arduino.list()[0], 57600);
		arduino.pinMode(pin, Arduino.OUTPUT);
	}

	public void draw(){
		if(mousePressed) {
			arduino.digitalWrite(pin, Arduino.HIGH);
		}else{
			arduino.digitalWrite(pin, Arduino.LOW);
		}
	}

}
