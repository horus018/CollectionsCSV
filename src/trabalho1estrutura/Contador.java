package trabalho1estrutura;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Contador {

	private ArrayList<Carro> carros;

	public Contador(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public void contar() {
		Carro menorPreco = carros.get(0);
		Carro maiorPreco = carros.get(0);
		String marcaMaisFrequente = "";
		int maiorFrequencia = 0;

		for (Carro carro : carros) {
			if (carro.getPreco().compareTo(menorPreco.getPreco()) < 0) {
				menorPreco = carro;
			}

			if (carro.getPreco().compareTo(maiorPreco.getPreco()) > 0) {
				maiorPreco = carro;
			}

			int frequencia = 0;
			for (Carro outroCarro : carros) {
				if (outroCarro.getMarca().equals(carro.getMarca())) {
					frequencia++;
				}
			}

			if (frequencia > maiorFrequencia) {
				maiorFrequencia = frequencia;
				marcaMaisFrequente = carro.getMarca();
			}
		}
		
		String mensagem = 
				"Marca mais frequente: " + marcaMaisFrequente +", aparece "+ maiorFrequencia + " vezes \n" +
				"Carro com maior preço: " + maiorPreco + "\n" + 
				"Carro com menor preço: " + menorPreco;
				

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
