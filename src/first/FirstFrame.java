package first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstFrame extends JFrame implements ActionListener{

//	private JPanel p = new JPanel();
//	private CardLayout layout = new CardLayout();
	private MainFrame frame;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new FirstFrame((byte)1);
	}
	public FirstFrame(){}

	public FirstFrame(byte b){
		setTitle("クソゲー");
		setBounds(10, 10, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

//		add(p);
		add(new StartPanel());

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		String str = e.getActionCommand();

		if(str.equals("stage1")){
			try {
				frame = new MainFrame(".\\Stage\\Field1.txt");
			} catch (NumberFormatException | IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}else if(str.equals("stage2")){
			try {
				frame = new MainFrame(".\\Stage\\Field1.txt");
			} catch (NumberFormatException | IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}else if(str.equals("stage3")){
			try {
				frame = new MainFrame(".\\Stage\\Field1.txt");
			} catch (NumberFormatException | IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}else if(str.equals("stage4")){
			try {
				frame = new MainFrame(".\\Stage\\Field1.txt");
			} catch (NumberFormatException | IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}else if(str.equals("random")){
			try {
				frame = new MainFrame(".\\Stage\\Field1.txt");
			} catch (NumberFormatException | IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}else if(str.equals("reset")){
			try {
				frame.Build();
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}
	}

}
