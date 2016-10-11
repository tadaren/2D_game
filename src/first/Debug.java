package first;

import java.io.IOException;

import javax.swing.JFrame;

public class Debug {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		frame.add(new StartPanel());
		frame.setBounds(10,10,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
