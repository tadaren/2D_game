package first;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel{

	public StartPanel(){
		JLabel title = new JLabel("クソゲー");
		title.setPreferredSize(new Dimension(100,100));
		title.setFont(new Font("Serif", Font.PLAIN, 12));
		setLayout(new BorderLayout());
		setBackground(Color.ORANGE);
		add(title, BorderLayout.NORTH);


		JPanel selectPanel = new JPanel();
		selectPanel.setOpaque(false);
		JButton stage1 = new JButton("stage1");
		stage1.addActionListener(new FirstFrame());
		stage1.setActionCommand("stage1");
		JButton stage2 = new JButton("stage2");
		stage2.addActionListener(new FirstFrame());
		stage2.setActionCommand("stage2");
		JButton stage3 = new JButton("stage3");
		stage3.addActionListener(new FirstFrame());
		stage3.setActionCommand("stage3");
		JButton stage4 = new JButton("stage4");
		stage4.addActionListener(new FirstFrame());
		stage4.setActionCommand("stage4");
		JButton random = new JButton("Random生成");
		random.addActionListener(new FirstFrame());
		random.setActionCommand("random");

		selectPanel.add(stage1);
		selectPanel.add(stage2);
		selectPanel.add(stage3);
		selectPanel.add(stage4);
		selectPanel.add(random);

		add(selectPanel, BorderLayout.CENTER);
	}



}
