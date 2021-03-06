package com.metsci.sst;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;

import javax.imageio.ImageIO;

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
			BufferedImage registeredImage = register1(rawImage);
			ImageIO.write(registeredImage,"png",new File("src/main/resources/arcticicecap/full/"+file.getName()));
		}
	}
	private static BufferedImage register1(BufferedImage img) {
		BufferedImage newImage = new BufferedImage(2*img.getWidth(),2*img.getHeight(),img.getType());
		Graphics2D g2d = newImage.createGraphics();
		g2d.setBackground(Color.green);
		g2d.clearRect(0,0,newImage.getWidth(),newImage.getHeight());
		g2d.rotate(Math.PI/4,newImage.getWidth()/2,newImage.getHeight()/2);
		g2d.drawImage(img,(int)newImage.getWidth()/4,newImage.getHeight()/4,null);
		int tx = 440;//65.04
		int ty = 208;//65.04
		int bx = 340;//65.04
		int by = 738;//65.04
		int lx = 126;//65.04
		int ly = 524;//65.04
		int rx = 655;//65.04
		int ry = 422;//65.04
		Polygon rectangle = new Polygon(new int[]{tx,rx,bx,lx},new int[]{ty,ry,by,ly},4);
		for(int x=0;x<newImage.getWidth();x++)
			for(int y=0;y<newImage.getHeight();y++){
				Color color = new Color(newImage.getRGB(x, y));
				if(color.getBlue()<200 || !rectangle.contains(new Point(x,y))){
					newImage.setRGB(x, y, new Color(255,0,0,0).getRGB());
				}
			}
		return newImage.getSubimage(lx, ty, rx-lx, by-ty);
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
