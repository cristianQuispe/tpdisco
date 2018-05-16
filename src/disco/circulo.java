package disco;

public class circulo {

	private double radioInterior;
	private double radioExterior;
	

	public circulo (double radio1,double radio2) {
		
		this.radioInterior= radio1;
		this.radioExterior= radio2;
		
	}
	
	public double  calcularPerimetroExterior() {
		
		
		double perimetroExterior= 2*3.14*radioExterior;
		return perimetroExterior;
	}
public double calcularPerimetroInterior() {
		
		double perimetroInterior= 2*3.14*radioInterior;
	
		return perimetroInterior;
	}
	
	public double calcularSuperficie() {
		
		double superficie=3.14*(radioExterior*radioExterior-radioInterior*radioInterior);
		return superficie;
	}

	public double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	
	
	
}
