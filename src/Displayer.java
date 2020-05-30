import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;


public class Displayer extends JFrame
{
	
	
	Mosaic mosaic;
	BufferedImage image;
	private int xDisplaySize;
	private int yDisplaySize;
	private int xSize;
	private int ySize;
	private String imagePath = "C:\\Users\\Thomas\\OneDrive - VCCS Student Advantage\\CSC 201\\nnnn\\src\\data\\temp_map.png";
	File f;
	
	
	Displayer(Mosaic mos, int xDisplay, int yDisplay)
	{

		this.xDisplaySize = xDisplay;
		this.yDisplaySize = yDisplay;
		this.mosaic = mos;
		this.xSize = mosaic.getXSize();
		this.ySize = mosaic.getYSize();
		this.image = new BufferedImage(this.xSize, this.ySize, BufferedImage.TYPE_INT_RGB);
		for(int x = 0; x < this.xSize; x++) 
		{
			for(int y = 0; y < this.ySize; y++) 
			{
				image.setRGB(x,y,mosaic.get24BitColor2(x, y));
			}
		}
		try 
		{
			f = new File(imagePath);
			ImageIO.write(image, "png", f);
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public void display() 
	{
		JPanel panel =  new JPanel();
		panel.setPreferredSize(new Dimension(400, 400));
		//panel.setSize(this.xDisplaySize, this.yDisplaySize);
		panel.setBackground(Color.WHITE);
		ImageIcon imIcon =  new ImageIcon(imagePath);
		
		JLabel label = new JLabel();
		label.setIcon(imIcon);
		panel.add(label);
		this.getContentPane().add(panel);
		this.setVisible(true);
	}
	
	
	
}
