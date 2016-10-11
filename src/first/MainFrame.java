package first;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements KeyListener{

	private final int SIZE = 40;
	private int limit_X;
	private int limit_Y;
	private BallPanel panel;
	private MyFieldPanel mainpanel;
	private JPanel base;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		new MainFrame(".\\Stage\\Field1.txt");

	}

	MainFrame(String filename) throws NumberFormatException, IOException{
		setTitle("2D Game");
		limit_X = Integer.parseInt(sub.MyFileReader.FileRead(filename, 0));
		limit_Y = Integer.parseInt(sub.MyFileReader.FileRead(filename, 1));
		setBounds(400,80, SIZE*limit_X+15, SIZE*limit_Y+40);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		base = new JPanel();
		base.setLayout(null);
		addKeyListener(this);
		Build();

		add(base);
		setVisible(true);
	}

	public void Build() throws IOException{
		mainpanel = new MyFieldPanel();
		mainpanel.setBounds(5, 1, SIZE*limit_X, SIZE*limit_Y);
		base.add(mainpanel);
		mainpanel.BuildField(limit_X,limit_Y);

		panel = new BallPanel(SIZE);
		panel.setBounds(5, 1, limit_X*SIZE, limit_Y*SIZE);
		base.add(panel, 0);

		mainpanel.ChangeColor(panel.getDX(), panel.getDY());
	}

	public void Reset() throws IOException{
		base.removeAll();
		Build();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
//		e.getKeyCode();
		if(		  e.getKeyCode()==KeyEvent.VK_UP  && panel.getDY()>0 && mainpanel.CheckColor(panel.getDX(),panel.getDY()-1)){
			panel.Move((byte)0, (byte)-1);
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT && panel.getDX()>0 && mainpanel.CheckColor(panel.getDX()-1,panel.getDY())){
			panel.Move((byte)-1, (byte)0);
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT && panel.getDX()<limit_X-1 && mainpanel.CheckColor(panel.getDX()+1,panel.getDY())){
			panel.Move((byte)1, (byte)0);
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN && panel.getDY()<limit_Y-1 && mainpanel.CheckColor(panel.getDX(),panel.getDY()+1)){
			panel.Move((byte)0, (byte)1);
		}

		mainpanel.ChangeColor(panel.getDX(), panel.getDY());

		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
