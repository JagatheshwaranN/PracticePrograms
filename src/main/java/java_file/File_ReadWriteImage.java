package java_file;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class File_ReadWriteImage {

	public static void readWriteImageUsingFile() {
		File file = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/Puppy.jpg");
		BufferedImage image = null;
		try {
			image = ImageIO.read(file);

			ImageIO.write(image, "jpg", new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/output1.jpg"));
			ImageIO.write(image, "png", new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/output1.png"));
			System.out.println("Image Read Write Done using File");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readWriteImageUsingUrl() {

		URL url = null;
		BufferedImage image = null;

		try {
			url = new URL("https://www.w3schools.com/html/img_chania.jpg");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		try {
			image = ImageIO.read(url);

			ImageIO.write(image, "jpg", new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/output2.jpg"));
			ImageIO.write(image, "png", new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/output2.png"));
			System.out.println("Image Read Write Done using URL");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String ar[]) {
		readWriteImageUsingFile();
		readWriteImageUsingUrl();

	}

}
