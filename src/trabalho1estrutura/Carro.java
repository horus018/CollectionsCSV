package trabalho1estrutura;

import java.math.BigDecimal;

public class Carro {
    private String ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private BigDecimal preco;

    public Carro(String ano, String marca, String modelo, String cor, String placa, BigDecimal preco) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

	@Override
	public String toString() {
		return "Carro [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", placa=" + placa
				+ ", preco=R$" + preco + "]";
	}
    
    
    
}
