package package2;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DesktopScreenshot {

	public static void main(String[] args) throws AWTException {
		String dir = System.getProperty("user.dir");
		Robot r=new Robot();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rt=new Rectangle(dim);
		BufferedImage pic=r.createScreenCapture(rt);
		File destFile=new File(dir+"/screenshots/desktop.png");
		try {
			ImageIO.write(pic, "png", destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Desktop Screenshot Taken");
	}

}
