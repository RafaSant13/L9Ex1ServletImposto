package controller;

public class SPController implements ICalculoImposto{
	
	private float area;
	private int comodos;

	public SPController(float area, int comodos) {
		this.area = area;
		this.comodos = comodos;
	}

	public String calcularImposto() {
		float imposto = (area * 10) + (comodos * 2);
		return "Imposto total = R$"+ imposto;
	}
	

}
