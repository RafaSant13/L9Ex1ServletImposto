package controller;

public class PAController implements ICalculoImposto{
	
	private float area;
	private float garagem;

	public PAController(float area, float garagem) {
		this.area = area;
		this.garagem = garagem;
	}

	@Override
	public String calcularImposto() {
		float imposto = 0;
		if (garagem >0) {
			imposto = (area * 7.5f)+(garagem*2.5f);
		}
		else {
			imposto = area*8;
		}
		
		return "Imposto total = R$"+ imposto;
	}

}
