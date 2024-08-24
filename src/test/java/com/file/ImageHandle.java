package com.file;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandle {

	public static void main(String[] args) {
		String path="https://images-eu.ssl-images-amazon.com/images/G/31/IMG20/Home/2024/Gateway/BTFGW/PCQC/372x232_Home_decor_1._SY232_CB584596691_.jpg";
		try {
			URL url=new URI(path).toURL();
	//	File file=new File("C:\\Users\\Ganesh\\Downloads\\file\\laptop.jpg");

		BufferedImage image=ImageIO.read(url);
		ImageIO.write(image, "jpg", new File("C:\\Users\\Ganesh\\Downloads\\file\\laptop.jpg"));
		ImageIO.write(image, "gif", new File("C:\\Users\\Ganesh\\Downloads\\file\\laptop.gif"));
		ImageIO.write(image, "png", new File("C:\\Users\\Ganesh\\Downloads\\file\\laptop.png"));
		ImageIO.write(image, "bmp", new File("C:\\Users\\Ganesh\\Downloads\\file\\laptop.bmp"));
		System.out.println("Files are stored");
		} catch (Exception e) {
			System.out.println("Some exceptions are comming....");
			e.printStackTrace();
		}

	}

}
