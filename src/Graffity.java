import org.jointheleague.graphical.robot.Robot;

public class Graffity {
public static void main(String[] args) {
	Robot bob = new Robot("vic");
	//n start
	bob.penDown();
	bob.move(5);
	bob.turn(10);
	bob.move(100);
	bob.turn(150);
	bob.move(100);
	bob.turn(-150);
	bob.move(110);
	bob.turn(75);
	//n end
	//i start+
	bob.penUp();
	bob.move(50);
	bob.turn(90);
	bob.penDown();
	bob.turn(5);
	bob.move(5);
	bob.penUp();
	bob.move(20);
	bob.penDown();
	bob.move(80);
	//i end
	bob.turn(-90);
	bob.penUp();
	bob.move(100);
	bob.turn(-180);
	bob.penDown();
	for (int i = 0; i < 180; i++) {
		bob.move(1);
		bob.turn(1);
	}
}
}
