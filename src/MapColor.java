

public class MapColor {
private int R;
private int G;
private int B;



MapColor(int i, int j, int k){
	this.R = i;
	this.G = j;
	this.B = k;
}

public void toString(MapColor c) {
	System.out.println("<" + Integer.toString(this.R) + ", " +
Integer.toString(this.G) + ", " + Integer.toString(this.B)+">" );
}
	
public int getR() {
	return this.R;
}
public int getG() {
	return this.G;
}
public int getB() {
	return this.B;
}

}
