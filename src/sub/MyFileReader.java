package sub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MyFileReader {

	public static void FileRead(String fileName) throws IOException{
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}

		br.close();

	}

	public static String FileRead(String fileName, int index) throws IOException{
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str = null;

		for(int i = 0; i <= index; i++){
			str = br.readLine();
		}
		br.close();
		return str;
	}

	public static byte[][] RoadField(String fileName,int x, int y) throws IOException{
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));

		byte[][] readField = new byte[x][y];
		String str = null;
		br.readLine();
		br.readLine();
		for(int j = 0;(str = br.readLine()) != null && j < y; j++){
			for(int i = 0; i < x; i++){
				readField[i][j] = (byte) Integer.parseInt(str.substring(i, i+1));
			}
		}
		br.close();
		return readField;
	}

}
