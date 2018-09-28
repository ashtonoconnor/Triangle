import javax.swing.JOptionPane;

public class Rectangle {
	private double sideA;
	private double sideB;
	private double perimeter;
	private double area;
	private double diagonal;

	public Rectangle() {
		
	}
	public void setVarstoZero() {
		sideA = 0.0;
		sideB = 0.0;
		perimeter = 0.0;
		area = 0.0;
		diagonal = 0.0;
		
	}
	public void showVars() {
		String msg = "Side A = " + sideA + ", " + "Side B = " + sideB + ", " + "Perimeter = " + perimeter + ", " + "Area = " + area +  ", " + "Diagonal = " + diagonal;
		JOptionPane.showMessageDialog(null, msg);
	}
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A:"));
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B:"));
	}
	public void calcPerimeter() {
		perimeter = (sideA*2.0)+(sideB*2.0);
				
	}
	public void calcArea() {
		area = sideA*sideB;
	}
	public void calcDiagonal() {
		double p = 0.0;
		p = (Math.pow(sideA, 2.0))+ (Math.pow(sideB, 2.0));
		diagonal = Math.sqrt(p);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
