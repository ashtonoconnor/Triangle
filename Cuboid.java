import javax.swing.JOptionPane;

public class Cuboid {
	
	private double sideA, sideB, sideC;
	private double surfaceArea;
	private double volume;
	
	public Cuboid() {
		
	}
	
	public void setVarstoZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		surfaceArea = 0.0;
		volume = 0.0;
	}
	public void showVars() {
		String msg = "Side A = " + sideA + ", " + "Side B = " + sideB + ", " + "Side C = " + sideC + ", " + "Surface area = " + surfaceArea + ", " + "Volume = " + volume;
		JOptionPane.showMessageDialog(null, msg);
	}
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A:"));
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B:"));
		
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C:"));
	}
	public void calcSurfaceArea() {
		surfaceArea = (2.0*sideA*sideB)+(2.0*sideB*sideC)+(2.0*sideA*sideC);
	}
	public void calcVolume() {
		volume = (sideA*sideB*sideC);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
