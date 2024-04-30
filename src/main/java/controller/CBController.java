package controller;

public class CBController implements ICalculoImposto {
	
	private float area;
	private int idade;

	public CBController(float area, int idade) {
		this.area = area;
		this.idade = idade;
	}

	@Override
	public String calcularImposto() {
		float imposto = area *5;
		if (idade>50) {
			imposto+= idade * 3;
		}
		else if (idade<20) {
			imposto += idade * 2;
		}
		else {
			imposto += idade * 2.5f;
		}
		return "Imposto total = R$"+ imposto;
	}

}
