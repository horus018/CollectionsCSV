package trabalho1estrutura;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LeitorArquivo {
	
	private ArrayList<Carro> listaCarros = new ArrayList<>();

	public ArrayList<Carro> getListaCarros() {
		return listaCarros;
	}

	public void lerArquivo() {
		try {
			Reader leitorArquivo = new FileReader("carros.csv");
			CSVFormat configCSV = CSVFormat.Builder.create().setHeader("ano", "marca", "modelo", "cor", "placa", "preco").setSkipHeaderRecord(true).build();
			CSVParser interpretadorCSV = configCSV.parse(leitorArquivo);

			for (CSVRecord record : interpretadorCSV.getRecords()) {
				Carro carro = new Carro(record.get("ano"), record.get("marca"), record.get("modelo"),
						record.get("cor"), record.get("placa"), new BigDecimal(record.get("preco")));
				listaCarros.add(carro);
			}

		} catch (IOException e) {
			e.printStackTrace();
//			System.out.println("Erro ao abrir arquivo CSV");
		}
	}
}
