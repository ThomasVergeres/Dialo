

import java.io.IOException;

public class threadingExperiementing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mosaic A = new Mosaic(3, 3);
		Mosaic B = new Mosaic(3, 3);
		A.changeColor(0, 0, new MapColor(100,100,100));
		A.changeColor(0, 1, new MapColor(100,0,100));
		A.changeColor(1, 0, new MapColor(100,0,100));
		try {
			A.saveTestMosaic();
			B.loadTestMap();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
