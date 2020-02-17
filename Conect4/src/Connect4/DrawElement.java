package Connect4;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GRect;

/**
 * The single Element drawing class.
 * 
 * Präsentation (view). MVC
 *
 */
public class DrawElement extends GCompound {

	private int size;
	/**
	 * Draws the rects and circles.
	 * 
	 * @param size the rect(background) size.
	 */
	public DrawElement(int size) {
		
		this.size = size;

		GRect rect = new GRect(0, 0, size, size);
		rect.setFillColor(Color.BLUE);
		rect.setFilled(true);
		add(rect);

		GOval circle = new GOval(10, 10, size - 20, size - 20);
		circle.setFillColor(Color.WHITE);
		circle.setFilled(true);
		add(circle);

	}

	public void drawPlayer(int x, int y, Color fillColor) {

		GOval circle = new GOval(x + 10, y + 10, size - 20, size - 20);
		circle.setFillColor(fillColor);
		circle.setFilled(true);
		add(circle);
	}
}