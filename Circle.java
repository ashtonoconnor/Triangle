import javax.swing.JOptionPane;

public class Circle {

	private double radius; 
	private double circumference;
	private double area;
	
	public Circle() {
		
	}
	public void setVarstoZero() {
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}
	public void showVars() {
		String msg = "Radius = " + radius + ", " + "Circumference = " + circumference + ", " + "Area = " + area;
		JOptionPane.showMessageDialog(null, msg);
		
	}
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for radius:"));
	}
	public void calcCircum() {
		 circumference = (Math.PI)*(radius*2.0);
	}
	public void calcArea() {
		area = (Math.PI)*(Math.pow(radius, 2.0));
	}
	
	
	
	
	
	
	
}
