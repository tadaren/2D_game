package first;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import sub.MyFileReader;

public class MyFieldPanel extends JPanel{

	JPanel[][] Field;

	public void BuildField(int cx, int cy) throws IOException{
		setLayout(new GridLayout(cy, cx));
		Field = new JPanel[cx][cy];
		byte[][] FileField = MyFileReader.RoadField(".\\Stage\\Field1.txt", cx, cy);
		for(int i = 0;i < cx; i++){
			for(int j = 0; j < cy; j++){
				Field[i][j] = new JPanel();
				if(FileField[i][j] == 0){
					Field[i][j].setBackground(Color.CYAN);
				}else{
					Field[i][j].setBackground(Color.BLACK);
				}

				Field[i][j].setBorder(new LineBorder(Color.black, 1));
			}
		}

		for(int j = 0; j < cy; j++){
			for(int i = 0; i < cx; i++){
				add(Field[i][j]);
			}
		}
	}

	public boolean CheckColor(int x, int y){
		if(Field[x][y].getBackground() == Color.CYAN){
			return true;
		}else{
			return false;
		}
	}

	public void ChangeColor(int x,int y){
		Field[x][y].setBackground(Color.YELLOW);
	}

}
