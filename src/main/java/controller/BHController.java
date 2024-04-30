package controller;


public class BHController implements ICalculoImposto{
	
	private float area;
	private int quartos;

	public BHController(float area, int quartos) {
		this.area = area;
		this.quartos = quartos;
	}

	@Override
	public String calcularImposto() {
		float imposto = (area * 7) + (float)(quartos * 4);
		return "Imposto total = R$"+ imposto;
	}

}
