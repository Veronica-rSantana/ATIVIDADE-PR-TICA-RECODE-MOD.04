package br.com.crud.model;

public class Passagens {
		private int id_passagem;
		private String Origem;
		private String Destino;
		private String DataIda;
		private String DataVolta;
		private Float Valor;
	
		public String getDestino() {
			return Destino;
		}
		public void setDestino(String destino) {
			Destino = destino;
		}
		
		public int getId_passagem() {
			return id_passagem;
		}
		public void setId_passagem(int id_passagem) {
			this.id_passagem = id_passagem;
		}
		public String getOrigem() {
			return Origem;
		}
		public void setOrigem(String origem) {
			Origem = origem;
		}
		public String getDataIda() {
			return DataIda;
		}
		public void setDataIda(String dataIda) {
			DataIda = dataIda;
		}
		public String getDataVolta() {
			return DataVolta;
		}
		public void setDataVolta(String dataVolta) {
			DataVolta = dataVolta;
		}
		public Float getValor() {
			return Valor;
		}
		public void setValor(Float valor) {
			Valor = valor;
		}		
}
