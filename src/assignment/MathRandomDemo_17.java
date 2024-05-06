package assignment;

//Using Math.random() get the radius of 10 circles & find the area of each circle

public class MathRandomDemo_17 {

	public static void main(String[] args) {
		double pi = Math.PI;
		for(int radius = 1; radius < 11; radius++) {
			System.out.println("Area of the circle is: "+ pi*radius*radius + " sq. units if the radius is " + radius + " units");
		}
	}

}