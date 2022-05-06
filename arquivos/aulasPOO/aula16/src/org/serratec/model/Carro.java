package org.serratec.model;

import java.util.Optional;

public class Carro {
	private String marca;
	private String modelo;
	private Double valor;
	private Optional<Seguro> seguro;

	public Carro() {
	}

	public Carro(String marca, String modelo, Double valor, Optional<Seguro> seguro) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", valor=" + valor + ", seguro=" + seguro + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Double getValor() {
		return valor;
	}

	public Optional<Seguro> getSeguro() {
		return seguro;
	}

}
