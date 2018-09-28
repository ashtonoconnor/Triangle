import javax.swing.JOptionPane;

public class Runner {
	
	/**********************************************************************************************
	 * circle: enter r, calculate circumference, area
	 * rectangle: input side A and B,     calculate perimeter and area, and diagonal
	 * triangle:  input sides A, B, C,    calculate area, perimeter, all angles                    DONE
	 * Cuboid:    input sides A, B, C,    calculate volume, total surface area
	 * Sphere:    input radius,           calculate volume, and surface area
	 * pi* r^2 === Math.pi*Math.pow(r, 2);
	 * 
	 */
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to my program, by Ashton O'Connor, 9/14/18, period 3A");
		
		//JOptionPane.showMessageDialog(null, "Hello Java World -- "
		//		+ "Please welcome ME! TO THE SMART Java community!");
		
		// Instantiate each class

		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		
		int goAgain = 1;
		
		
		while(goAgain == 1) {
		
		String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
		//JOptionPane.showMessageDialog(null, msg);
		
		String answer = JOptionPane.showInputDialog(msg);
		//JOptionPane.showMessageDialog(null, answer);
		
		if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {             												//when comparing strings, == is unreliable, so use .equals() --String class methods
			
			JOptionPane.showMessageDialog(null, "YES, we are in Triangle");
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
			myTriangle.showVarsAngles();
		}
		else if ((answer.equals("Circle")) || (answer.equals("circle"))) {
			JOptionPane.showMessageDialog(null, "YES, we are in Circle");
			myCircle.setVarstoZero();
			myCircle.setRadius();
			myCircle.calcCircum();
			myCircle.calcArea();
			myCircle.showVars();
			
		}
		
		else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
			JOptionPane.showMessageDialog(null, "YES, we are in Rectangle");
			myRectangle.setVarstoZero();
			myRectangle.setSides();
			myRectangle.calcArea();
			myRectangle.calcPerimeter();
			myRectangle.calcDiagonal();
			myRectangle.showVars();
			
		}
		
		else if ((answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
			JOptionPane.showMessageDialog(null, "YES, we are in Cuboid");
			myCuboid.setVarstoZero();
			myCuboid.setSides();
			myCuboid.calcSurfaceArea();
			myCuboid.calcVolume();
			myCuboid.showVars();
			
		}
		
		else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
			JOptionPane.showMessageDialog(null, "YES, we are in Sphere");
			mySphere.setVarstoZero();
			mySphere.setRadius();
			mySphere.calcSurfacArea();
			mySphere.calcVolume();
			mySphere.showVars();
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Error. try again");
		}
		
		
	
		msg = "Would you like to go again (Y/N): ";
		answer = JOptionPane.showInputDialog(msg);
		
		//7JOptionPane.showMessageDialog(null, answer);
		
		if ((answer.equals("Y")) || (answer.equals("y")) || (answer.equals("Yes")) || (answer.equals("yes"))) {
			goAgain = 1;
		}
		else {
			goAgain = 0;
			JOptionPane.showMessageDialog(null, "Thank you! Come again!");
		}
				
	}//end of while
		
	}//end of main
	
}//end of Runner
