package trabalho1estrutura;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		boolean continuar = true;
		boolean placaEncontrada = false;
		LeitorArquivo leitorArquivo = new LeitorArquivo();
		leitorArquivo.lerArquivo();
		ArrayList<Carro> carros = leitorArquivo.getListaCarros();
		while (continuar) {

			Object[] options = { "Consultar veículo pela placa", "Ver estatísticas", "Sair do programa" };

			int escolha = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", "Menu principal",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

			if (escolha == 0) {
				placaEncontrada = false;
				String placa = JOptionPane.showInputDialog("Digite a placa do carro que deseja procurar");
				for (Carro carro : carros) {
					if (placa.equals(carro.getPlaca())) {
						JOptionPane.showMessageDialog(null, "Carro encontrado: " + carro);
						placaEncontrada = true;
					}
				}
				if (placaEncontrada == false) {
					JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum veículo com essa placa.");
				}
				
			} else if (escolha == 1) {
				Contador contador = new Contador(carros);
				contador.contar();
			} else {
				continuar = false;
			}

		}

	}

}
