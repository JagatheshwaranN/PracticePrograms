package java_excercises;

import java.io.IOException;

public class OpeningExternalApp {

	public static void main(String ar[]) {
		Runtime runtime = Runtime.getRuntime();
		
		String []str = new String[]{"C:\\Program Files\\Windows Media Player\\wmplayer.exe","E:\\i.mp3"};
		try {
			runtime.exec(str);
			//runtime.exec("notepad.exe");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
