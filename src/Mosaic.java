
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Mosaic {
	public int testSize = 100;
	private int xSize;
	private int ySize;
	private int [][][] map;
	Mosaic(){
		
		this.xSize= testSize;
		this.ySize= testSize;
		
		this.map = new int[xSize][ySize][3];
	}


	
	Mosaic(int x, int y){
		
		this.xSize= x;
		this.ySize= y;
		
		this.map = new int[xSize][ySize][3];
	}
	
	public void changeColor(int x, int y, MapColor color) {
		this.map[x][y]= new int[] {color.getR(), color.getG(), color.getB()};
	}
	
	public void testFill() {
		for(double i = 0; i < this.xSize; i++) {
			for(double u = 0; u < this.ySize; u++) {
				this.map[(int)i][(int)u]= new int[] { (int)(255 * i/xSize), (int)(255 * u/xSize), (int)(255 * ((i+u)/(xSize + ySize)))};
			}
		}
	}
	
	public int getXSize() {
		return(this.xSize);
	}
	public int getYSize() {
		return(this.ySize);
	}
	public MapColor getColor(int x, int y) {
		return(new MapColor(this.map[x][y][0],this.map[x][y][1],this.map[x][y][2]));
	}
	public int[] getColorArray(int x, int y) {
		return(new int[] {this.map[x][y][0],this.map[x][y][1],this.map[x][y][2]});
	}
	
	public int get24BitRGB(int x, int y) {
		return((this.map[x][y][0]*6/256)*36 + (this.map[x][y][1]*6/256)*6 + (this.map[x][y][2]*6/256));
	}
	public int get24BitColor2(int x, int y) {
		return((this.map[x][y][0]<<16) | (this.map[x][y][1]<<8) | (this.map[x][y][2]));
	}
	public int get32BitColor(int x, int y) {
		return(((256<<24) | (this.map[x][y][0]<<16) | (this.map[x][y][1]<<8) | (this.map[x][y][2])));
	}
	
	public void paintCanvas(MapColor color) {
		for(int i = 0; i < this.xSize; i++) {
			for(int u = 0; u < this.ySize; u++) {
				this.map[i][u]= new int[] {color.getR(), color.getG(), color.getB()};
			}
		}
	}
	
	public void saveMosaic() throws IOException {
		String filename = "C:\\Users\\Thomas\\OneDrive - VCCS Student Advantage\\CSC 201\\nnnn\\src\\data\\" + Long.toString(System.currentTimeMillis()) + "_map.bin";
		FileWriter file = new FileWriter(filename);
		BufferedWriter writer= new BufferedWriter(file);
		for(int i = 0; i < this.xSize; i++) {
			for(int u = 0; u < this.ySize; u++) {
				for(int z = 0; z < 3; z++) {
					writer.write(Integer.toString(this.map[i][u][z]));
				    writer.newLine();
				}
			}
		}
		writer.flush();
		writer.close();
	}
	
	public void saveTestMosaic() throws IOException {
		String filename = "C:\\Users\\Thomas\\OneDrive - VCCS Student Advantage\\CSC 201\\nnnn\\src\\data\\test_map.bin";
		FileWriter file = new FileWriter(filename);
		BufferedWriter writer= new BufferedWriter(file);
		for(int i = 0; i < this.xSize; i++) {
			for(int u = 0; u < this.ySize; u++) {
				for(int z = 0; z < 3; z++) {
				    writer.write(Integer.toString(this.map[i][u][z]));
				    writer.newLine();
				}
			}
		}
		writer.flush();
		writer.close();
	}
	
	public void loadTestMap() throws IOException {
		
		String filename = "C:\\Users\\Thomas\\OneDrive - VCCS Student Advantage\\CSC 201\\nnnn\\src\\data\\test_map.bin";
		File file = new File(filename);
		Scanner inStream= new Scanner(file);
		for(int i = 0; i < this.xSize; i++) {
			for(int u = 0; u < this.ySize; u++) {
				for(int z = 0; z < 3; z++) {
				    this.map[i][u][z] = inStream.nextInt();
				    inStream.nextLine();
				}
			}
		}
		inStream.close();
	}
	
	public void loadMap() throws IOException {
		String filename = "C:\\Users\\Thomas\\OneDrive - VCCS Student Advantage\\CSC 201\\nnnn\\src\\data\\" + Long.toString(System.currentTimeMillis()) + "_map.bin";
		FileWriter file = new FileWriter(filename);
		BufferedWriter writer= new BufferedWriter(file);
		for(int i = 0; i < this.xSize; i++) {
			for(int u = 0; u < this.ySize; u++) {
				for(int z = 0; z < 3; z++) {
				    writer.write(this.map[i][u][z]);
				    writer.newLine();
				}
			}
		}
		writer.flush();
		writer.close();
	}
	
	public void displayTestMap() throws IOException {
		String filename = "C:\\Users\\Thomas\\OneDrive - VCCS Student Advantage\\CSC 201\\nnnn\\src\\data\\test_map.bin";
		FileWriter file = new FileWriter(filename);
		BufferedWriter writer= new BufferedWriter(file);
		for(int i = 0; i < this.xSize; i++) {
			for(int u = 0; u < this.ySize; u++) {
				for(int z = 0; z < 3; z++) {
				    writer.write(this.map[i][u][z]);
				    writer.newLine();
				}
			}
		}
		writer.flush();
		writer.close();
	}
	
	
	
	
}



