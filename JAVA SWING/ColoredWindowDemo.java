import java.awt.Color;

public class ColoredWindowDemo{
	
	public static void main(String []args){
		ColoredWindow a = new ColoredWindow();
		a.setVisible(true);

		ColoredWindow b = new ColoredWindow(Color.YELLOW);
		b.setVisible(true);
	}
}