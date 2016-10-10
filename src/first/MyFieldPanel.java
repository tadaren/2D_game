package first;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MyFieldPanel extends JPanel{

	JPanel[][] Field;

	public void BuildField(int cx, int cy){
		setLayout(new GridLayout(cx, cy));
		Field = new JPanel[cx][cy];
		for(int i = 0;i < cx; i++){
			for(int j = 0; j < cy; j++){
				Field[i][j] = new JPanel();
			}
		}

		for(int i = 0; i < cx; i++){
			for(int j = 0; j < cy; j++){
				Field[i][j].setBackground(Color.CYAN);
				Field[i][j].setBorder(new LineBorder(Color.black, 1));

				add(Field[i][j]);
			}
		}
	}
	
	public boolean CheckColor(int x, int y){
		if(Field[y][x].getBackground() == Color.CYAN){
			return true;
		}else{
			return false;
		}
	}

	public void ChangeColor(int x,int y){
		Field[y][x].setBackground(Color.YELLOW);
	}

}
