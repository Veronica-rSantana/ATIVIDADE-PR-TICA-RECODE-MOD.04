package br.com.crud.model;

public class Destino {
		private int id_destino;
		private String Cidade_Destino;
		private String Estado_Destino;
	
		public int getId_destino() {
			return id_destino;
		}
		public void setId_destino(int id_destino) {
			this.id_destino = id_destino;
		}
		public String getCidade_Destino() {
			return Cidade_Destino;
		}
		public void setCidade_Destino(String cidade_Destino) {
			Cidade_Destino = cidade_Destino;
		}
		public String getEstado_Destino() {
			return Estado_Destino;
		}
		public void setEstado_Destino(String estado_Destino) {
			Estado_Destino = estado_Destino;
	}
}
