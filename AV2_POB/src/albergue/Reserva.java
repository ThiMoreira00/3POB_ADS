package albergue;

import java.util.Date;

public class Reserva {
	
	

	/*
	 * 
	 * A classe reserva possui os seguintes atributos: id, idQuarto, idCama, idCliente,
dataEntrada, dataSaida.

	 */
	
	int id;
	int idQuarto;
	int idCama;
	int idCliente;
	Date dataEntrada;
	Date dataSaida;
	
	public Reserva() {
		super();
	}
	
	public Reserva(int id, int idQuarto, int idCama, int idCliente, Date dataEntrada, Date dataSaida) {
		super();
		this.id = id;
		this.idQuarto = idQuarto;
		this.idCama = idCama;
		this.idCliente = idCliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdQuarto() {
		return idQuarto;
	}
	
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	public int getIdCama() {
		return idCama;
	}
	
	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", idQuarto=" + idQuarto + ", idCama=" + idCama + ", idCliente=" + idCliente
				+ ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + "]";
	}
	
	
}
