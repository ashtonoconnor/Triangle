import javax.swing.JOptionPane;

public class Sphere {
	private double radius;
	private double volume;
	private double surfaceArea;
	
	public Sphere() {
		
	}
	public void setVarstoZero() {
		radius = 0.0;
		volume = 0.0;
		surfaceArea = 0.0;
	}
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for radius:"));
	}
	public void showVars() {
		String msg = "Radius = " + radius + ", " + "Surface Area = " + surfaceArea + ", " + "Volume = " + volume;
		JOptionPane.showMessageDialog(null, msg);
	}
	public void calcVolume() {
		volume = (Math.PI*(4.0/3.0)*(Math.pow(radius, 3.0)));
	}
	public void calcSurfacArea() {
		surfaceArea = (4.0*Math.PI*(Math.pow(radius, 2.0)));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
