import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel{

	private int playerX = 0;
	private int playerY = 0;
	private int playerSize = 15;
	
	private int enemyX = 10;
	private int enemyY = 10;
	private int enemySize = 10;
	
	private int moveDistance = 5;
	private JFrame frame;
	
	public GamePanel(){
		frame = new JFrame("GAME");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 500, 500);
		frame.add(this);
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_UP){
					if(playerY > 0)
						playerY -= moveDistance;
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
					if(playerY < getHeight()-playerSize-1)
						playerY += moveDistance;
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
					if(playerX > 0)
						playerX -= moveDistance;
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					if(playerX < getWidth()-playerSize)
						playerX += moveDistance;
				}
			}
		});
		
		frame.setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, getWidth(), getHeight());
		g2.setColor(Color.RED);
		g2.fill(new Ellipse2D.Double(playerX, playerY, playerSize, playerSize));
		g2.setColor(Color.CYAN);
		g2.fill(new Ellipse2D.Double(enemyX, enemyY, enemySize, enemySize));
		moveEnemy();
		
		repaint();
	}
	
	private void moveEnemy(){
		Random rand = new Random();
		switch(rand.nextInt(4)){
		case 0: if(enemyX < getWidth()-enemySize)enemyX += moveDistance;break;
		case 1: if(enemyX > 0)enemyX -= moveDistance;break;
		case 2: if(enemyY < getWidth()-playerSize)enemyY += moveDistance;break;
		case 3: if(enemyY > 0)enemyY -= moveDistance;break;
		}
	}
	
	public static void main(String[] args) {
		new GamePanel();
	}

}
