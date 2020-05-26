import java.io.IOException;

public class HELLOOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mosaic myMos = new Mosaic();
		myMos.testFill();
		myMos.changeColor(0, 0, new MapColor(10,100,200));
		try {
			myMos.saveTestMosaic();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myMos.get24BitColor2(0, 0));
		System.out.println(myMos.get32BitColor(0, 0));
		Displayer myDisplay = new Displayer(myMos, myMos.getXSize(), myMos.getYSize());
		myDisplay.display();
		
	}

}
