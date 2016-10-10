package first;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class BallPanel extends JPanel{
	private int bx ;
	private int by ;
	private int SIZE;

	public BallPanel(int size){
		SIZE = size;
		setOpaque(false);
	}

	public int getDX(){return bx;}
	public int getDY() {return by;}

	public void Move(byte dx, byte dy){
		bx += dx;
		by += dy;
		repaint();
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.RED);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
							RenderingHints.VALUE_ANTIALIAS_ON);
		g2.fill(new Ellipse2D.Double(bx*SIZE+1, by*SIZE+1, SIZE-2, SIZE-2));
	}

}
