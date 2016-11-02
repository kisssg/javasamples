import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {
	public void paint(Graphics a) {
		a.drawString("Hello World!", 50, 30);
	}
}