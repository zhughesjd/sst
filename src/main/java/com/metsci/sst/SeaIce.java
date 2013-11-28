package com.metsci.sst;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SeaIce {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws Exception {
		createRegistered();
	}
	public static void obtainRaw() throws Exception{
		Timestamp timestamp = Timestamp.valueOf("2013-05-01 00:00:00");
		while(timestamp.before(Timestamp.valueOf("2013-11-01 00:00:00"))){
			String timeString = timestamp.toString().replace("-", "").substring(0,8);
			System.out.println(timeString);
			BufferedImage rawImage = ImageIO.read(new URL("ftp://sidads.colorado.edu/pub/DATASETS/nsidc0081_nrt_nasateam_seaice/browse/north/nt_"+timeString+"_f17_nrt_n.png"));
			ImageIO.write(rawImage,"png",new File("src/main/resources/arcticicecap/raw/"+timeString+".png"));
			timestamp = new Timestamp(timestamp.getTime()+24*3600*1000);
		}
	}
	public static void createRegistered() throws Exception{
		for(File file : new File("src/main/resources/arcticicecap/raw/").listFiles()){
			System.out.println(file.getName());
			BufferedImage rawImage = ImageIO.read(file);
			BufferedImage registeredImage = register(rawImage);
			ImageIO.write(registeredImage,"png",new File("src/main/resources/arcticicecap/registered/"+file.getName()));
		}
	}
	private static BufferedImage register(BufferedImage img) {
		int tx = img.getWidth()/2;
		int ty = img.getHeight()/2;
        AffineTransform at = new AffineTransform();
        at.translate(tx, ty);
        at.rotate(Math.PI/4);
        at.translate(-tx, -ty);
        AffineTransformOp op = new AffineTransformOp(at,AffineTransformOp.TYPE_BICUBIC);
        img = op.filter(img, null);
		int topSiberia = 120;//65.04
		int bottomEngland = 408;//50.788
		int leftCanada = 27;//57
		int rightRussia = 240;//75.5
        img = img.getSubimage(leftCanada, topSiberia, rightRussia-leftCanada+1,bottomEngland-topSiberia+1);
		for(int x=0;x<img.getWidth();x++)
			for(int y=0;y<img.getHeight();y++){
				Color color = new Color(img.getRGB(x, y));
				if(color.getBlue()<200 || y>270){
					img.setRGB(x, y, new Color(255,0,0,0).getRGB());
				}
			}
		return img;
	}

}
